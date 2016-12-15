/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab12;

/**
 *
 * @author chin_
 */
import java.awt.GridLayout;
import javax.swing.*;
import java.util.*;

public class Lab12 {
    
    public static JTextArea Even;
    public static JTextArea Odd;
    
    public static void main(String[] args) {
        createAndShowGUI();
        readFile(args[0]);
   }
   
   private static void createAndShowGUI() {
       JFrame jframe = new JFrame("Sends to Two Sides");
       jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jframe.setSize(400,400);
       jframe.setLocation(400,400);
       jframe.setLayout(new GridLayout(1,2,5,5));
       // add text area
       
       Even = new JTextArea(15,20);
       Odd = new JTextArea(15,20);
       // display window
       
       
       jframe.getContentPane().add(Odd);
       jframe.getContentPane().add(Even);
       
       jframe.pack();
       jframe.setVisible(true);
   }
   
   public static void readFile(String myFile){
       TextFileInput InputFile = new TextFileInput(myFile);
       String line = InputFile.readLine();
       while(line != null){
           System.out.println(line);
           if (Integer.parseInt(line)%2 == 0)
               Even.append(line+"\n");
           else
               Odd.append(line+"\n");
           line = InputFile.readLine();
       }
       
   }
} // class Lab4Program1
