/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab22;

import java.io.*;
import java.util.Random;

/**
 *
 * @author chin_
 */
public class saveMoney{
    public saveMoney() throws Exception{
    FileOutputStream fos = new FileOutputStream("money.out");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    Money[] money = new Money[3];
    for(int i = 0; i < 3 ; i++){
        Random r = new Random();
	int randomed = r.nextInt((3 - 1) + 1) + 1;
        if(randomed == 1){
            money[i] = new Dime();
            oos.writeObject(money[i]);
        }
        if(randomed == 2){
            money[i] = new Quarter();
            oos.writeObject(money[i]);
        }
        if(randomed == 3){
            money[i] = new Nickel();
            oos.writeObject(money[i]);
        }
    }

    oos.flush();
    oos.close();
    fos.close();
    }
}
