/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import javax.swing.*;
/**
 *
 * @author chin_
 */
public class DateList {
    private DateNode first;
    private DateNode last;
    private int ListCount;
    
    // constructors
    DateList(){
        first = null;
        last = null;
        ListCount = 0;
    }
    // add
    public void append(String d){
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
    // insert to specific location that was found
    public void insert(String d){
        Date212 t = new Date212(d);
        DateNode newNode = new DateNode(t);
        int loc = findLocation(d);
        DateNode current = first;
        //if size = 0 add newNode list = 1
        if( first == null){
            first = newNode;
            last = newNode;
            ListCount++;
        } //if end of list
        else if(ListCount == loc ){
            last.next = newNode;
            last = newNode;
            ListCount++;
        } // if front of list
        else if(loc == 0 ){
            newNode.next = first;
            first = newNode;
            ListCount++;
        } // if middle of list
        
        else{
            for(int i = 0; i <= loc; i++){
                if(i == loc - 1){
                    newNode.next = current.next;
                    current.next = newNode;
                    ListCount++;
                }
                current = current.next;
            }
        }
    }
    // find place to insert to sort the list
    public int findLocation(String d){
        DateNode current = first;
        int loc = 0;
        while(current != null){
            if(current.data.isSmaller(d) || current.data.isEqual(d)){
                loc++;
                current = current.next;
            }
            else{
                break;
            }
        }
        return loc;

    }
    // print sends textArea to GUI
    public JTextArea printList(){
        DateNode temp = first;
        JTextArea TA = new JTextArea(5, 20);
        while (temp != null)
        {
            TA.append(temp.data.toString()+"\n");
            temp = temp.next;
        }
        return TA;
    }

}
