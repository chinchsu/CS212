/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab18;

/**
 *
 * @author chin_
 */
public class Bill extends Money{
   private int dollars;
   
   public Bill (int d) {
      dollars = d;
   }
   public int getValue () {
      return dollars;
   }
   
   public String toString() {
       String s = "$ "+dollars+".00";
       return s;
   }
}
