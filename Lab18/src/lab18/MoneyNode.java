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
public class MoneyNode {
    public Money data;
    public MoneyNode next;
    
    public MoneyNode(Money d){
        data = d;
        next = null;
    }
}
