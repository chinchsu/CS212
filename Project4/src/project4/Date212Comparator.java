/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;
import java.util.Comparator;
/**
 *
 * @author chin_
 */
public class Date212Comparator implements Comparator<Date212>{
    public int compare(Date212 date1, Date212 date2) {
        //Social security numbers know how to compare, so just let them do it
        return date1.compareTo(date2);
    }
}
