/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author chin_
 */
public class DateNode {
    protected DateNode next;
    protected Date212 data;

    DateNode(Date212 a){
        data = a;
        this.next = null;
    }
}