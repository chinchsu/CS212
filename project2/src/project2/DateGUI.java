/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project2;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author chin_
 */

// create GUI
public class DateGUI extends JFrame{
    JPanel panel = new JPanel();
    static JTextArea textArea1; // text area left
    static JTextArea textArea2;
    // creats and fill text area
    DateGUI(JTextArea a, JTextArea b){
        super("DATE SORTER");
        textArea1 = a;
        textArea2 = b;
        createPanel();
        add(panel);
        setSize(500, 500);
        setLocation(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    private void createPanel() {
        panel.setLayout(new GridLayout(1, 2, 3, 3));
        panel.add(textArea1);
        textArea1.setMargin(new Insets(5, 5, 5, 5));
        panel.add(textArea2);
    }
    
}
