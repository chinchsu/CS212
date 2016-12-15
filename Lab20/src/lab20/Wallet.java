/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab20;

/**
 *
 * @author chin_
 */
public class Wallet {
  private MoneyList walletContents = new MoneyList();
  
  public Wallet(){
      
  }
  public void addToWallet(Money m){
      walletContents.append(m);
  }
  public void print () {
      System.out.println(walletContents.toString());
  }
  public String getValue() {
      return walletContents.getValue();
	  
  }
}