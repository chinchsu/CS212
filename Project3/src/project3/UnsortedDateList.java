/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

/**
 *
 * @author chin_
 */
public class UnsortedDateList extends DateList {
   // insert to specific location that was found
    @Override
    public void add(String d){
        try{
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
        catch(IllegalDate212Exception E){
            System.out.println(E);
        }
    }
    // find place to insert to sort the list
    private int findLocation(String d){
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
}
