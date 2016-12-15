/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author chin_
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DateList unsorted = new DateList();
        DateList sorted = new DateList();
        
        //read file
        File file = new File("C:\\file.txt");
        try {
            Scanner sc = new Scanner(file).useDelimiter(",|\\n|\\s");
            while (sc.hasNext()) {
                String temp = sc.next();
                if (temp.length() == 8 && isNumeric(temp)) {
                    unsorted.append(temp);
                    sorted.insert(temp);
                }
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }

        DateGUI mainGUI = new DateGUI(unsorted.printList(), sorted.printList());
    }
    // checks string formmating
    private static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }
    
}
