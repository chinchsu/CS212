/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab17;

/**
 *
 * @author chin_
 */
public class Lab17 {

    static String[] dataSource = {"B5", "Q", "B20", "Q", "P", "N","D"};
    static Money[] wallet = new Money[dataSource.length];

    public static void main(String[] args) {

        for (int i = 0; i < dataSource.length; i++) {
            char dataItem = dataSource[i].charAt(0);
            if (dataItem == 'B') {
                int billValue = Integer.parseInt(dataSource[i].substring(1, dataSource[i].length()));
                wallet[i] = new Bill(billValue);
            } else if (dataItem == 'Q') {
                wallet[i] = new Quarter();
            } else if (dataItem == 'P') {
                wallet[i] = new Penny();
            } else if (dataItem == 'N') {
                wallet[i] = new Nickel();
            } else if (dataItem == 'D') {
                wallet[i] = new Dime();
            }
        }
        printWallet();
        sumWallet();
    }

    public static void printWallet() {
        for (int i = 0; i < wallet.length; i++) {
            if (wallet[i] instanceof Bill) {
                System.out.println("$ " + ((Bill) wallet[i]).getValue() + ".00");
            } else {
                System.out.println(wallet[i]);
            }

        }
    }
    
    public static void sumWallet(){
        int dollars = 0;
        int cents = 0;
        for(int i=0; i < wallet.length; i++){
            if (wallet[i] instanceof Bill){
                dollars += ((Bill)wallet[i]).getValue();
            }
            else{
                cents += ((Coin)wallet[i]).getValue();
            }
        }
        if (cents > 100){
            dollars +=1;
            cents -= 100;
        }
        System.out.print("$ "+dollars+".");
        if (cents >= 10){
            System.out.println(cents);
        }
        else
            System.out.println("0"+cents);
    }
}
