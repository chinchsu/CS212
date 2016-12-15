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
public class Coin extends Money {
   private int value;
   
   public Coin(int v) {
      value = v;
   }
   public int getValue () {
      return value;
   }
   public String toString() {
      if(value >= 10){
      return ("$ 0."+getValue());
      }
      else
          return ("$ 0.0"+getValue());
   }
}
