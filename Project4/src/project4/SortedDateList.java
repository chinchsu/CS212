/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

/**
 *
 * @author chin_
 */
public class SortedDateList extends DateList {
    @Override
    public void add(String d){
        try{
            Date212 t = new Date212(d);
            DateNode newNode = new DateNode(t);
            // if empty list first and last to new node
            // else last point to new node and last node = newNode
            if (first == null) {
                first = newNode;
                last = newNode;
                ListCount++;
            } else {
                last.next = newNode;
                last = newNode;
                ListCount++;
            }
        }
        catch(IllegalDate212Exception E){
            System.out.println(E);
        }
    }
}
