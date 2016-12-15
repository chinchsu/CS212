/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;

/**
 *
 * @author chin_
 */
public class Lab1 {

    public static void print(Object obj){
        System.out.print(obj);
    }
    
    public static void main(String[] args)
    {
        int[] a = { 3, 1, 4, 5, 9, 2, 7 };
        int smallest = a[0];
        for(int i=0; i < a.length; i++){
            if(a[i] < smallest){
                smallest = a[i];
            }
        }
        print(smallest);
    }
    
}
