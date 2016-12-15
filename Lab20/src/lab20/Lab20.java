/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab20;

import java.io.FileNotFoundException;

/**
 *
 * @author chin_
 */
public class Lab20 {

    static String[] dataSource = {"B5", "Q", "B18", "Q", "B10", "P", "N", "BAD", "D", "Q", "D"};
    static Wallet myWallet = new Wallet();

    public static void main(String[] args) {
        // try / catch begins here
        //try {
            for (int i = 0; i < dataSource.length; i++) {
                char dataItem = dataSource[i].charAt(0);
                if (dataItem == 'B') {
                    try{
                    int billValue = Integer.parseInt(dataSource[i].substring(1, dataSource[i].length()));
                    myWallet.addToWallet(new Bill(billValue));
                    }
                    catch(IllegalBillException ex){
                        System.out.println(ex);
                    }
                    catch(NumberFormatException nfe){
                        System.out.println(nfe);
                    }
                } else if (dataItem == 'Q') {
                    myWallet.addToWallet(new Quarter());
                } else if (dataItem == 'D') {
                    myWallet.addToWallet(new Dime());
                } else if (dataItem == 'N') {
                    myWallet.addToWallet(new Nickel());
                } else if (dataItem == 'P') {
                    myWallet.addToWallet(new Penny());
                }
            }
        //} catch (IllegalBillException ex) {
        //    System.out.println(ex);
        //}
        myWallet.print();
        System.out.println("My wallet contains: $" + myWallet.getValue());
    }

}
