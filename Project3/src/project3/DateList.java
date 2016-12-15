/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

import javax.swing.*;
/**
 *
 * @author chin_
 */
public abstract class DateList {
    protected DateNode first;
    protected DateNode last;
    protected int ListCount;
    
    // constructors
    DateList(){
        first = null;
        last = null;
        ListCount = 0;
    }
    
    public abstract void add(String d);
    
}
