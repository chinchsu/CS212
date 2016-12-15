/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab22;

/**
 *
 * @author chin_
 */
import java.io.*;
import java.util.Date;

public class readMoney {
    
    public readMoney() throws Exception{
    FileInputStream fis = new FileInputStream("money.out");
    ObjectInputStream ois = new ObjectInputStream(fis);
    for(int i=0;i<3;i++){
        Money m = (Money)ois.readObject();
        System.out.println(m);
    }
    
    ois.close();
    fis.close();
    }
}
