/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project4;

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
    DateGUI(){
        super("DATE SORTER");
        setSize(500, 500);
        setLocation(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createMenu();
        createGrid();
        add(panel);
        setVisible(true);
    }
    
    public void createMenu( ) {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem item;
        FileHandlerMenu fmh = new FileHandlerMenu(this);
        item = new JMenuItem("Open");
        item.addActionListener(fmh);
        fileMenu.add(item);
        fileMenu.addSeparator();
        item = new JMenuItem("Quit");
        item.addActionListener(fmh);
        fileMenu.add(item);
        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
    }
    
    public void createGrid() {
        textArea1 = new JTextArea(5,20);
        textArea2 = new JTextArea(5,20);
        panel.setLayout(new GridLayout(1, 2, 3, 3));
        panel.add(textArea1);
        textArea1.setMargin(new Insets(5, 5, 5, 5));
        panel.add(textArea2);
    }
    
}
