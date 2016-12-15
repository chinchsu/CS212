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
public class Bill extends Money{
   private int dollars;
   
   public Bill (int d) {
      if(d == 1 || d == 10 || d ==20 || d == 5 || d == 100 || d == 50)
        dollars = d;
      else
          throw new IllegalBillException("This bill : " + d + " does not exist");
   }
   public int getValue () {
      return dollars;
   }
   
   public String toString() {
       String s = "$ "+dollars+".00";
       return s;
   }
}
