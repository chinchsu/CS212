/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab19;

/**
 *
 * @author chin_
 */
import javax.swing.*;
import java.awt.*;
public class SampleGUI extends JFrame {
   
   JMenuBar    menuBar  = new JMenuBar();
    
   public SampleGUI(String title, int height, int width) {
	    setTitle(title);
	    setSize(height,width);
            setLocation  (400,200);
            setJMenuBar(menuBar);
	    createFileMenu();
            createEditMenu();
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
   } //SSNGUI

   private void createFileMenu( ) {
      JMenuItem   item;
      JMenu       fileMenu = new JMenu("File");
      FileMenuHandler fmh  = new FileMenuHandler(this);

      item = new JMenuItem("Open");    //Open...
      item.addActionListener( fmh );
      fileMenu.add( item );

      fileMenu.addSeparator();           //add a horizontal separator line
    
      item = new JMenuItem("Quit");       //Quit
      item.addActionListener( fmh );
      fileMenu.add( item );

      menuBar.add(fileMenu);
    
   } //createMenu
   private void createEditMenu(){
      JMenuItem   item;
      JMenu       editMenu = new JMenu("Edit");
      FileMenuHandler fmh  = new FileMenuHandler(this);

      item = new JMenuItem("Find");    //Open...
      item.addActionListener( fmh );
      editMenu.add( item );

      editMenu.addSeparator();           //add a horizontal separator line
    
      item = new JMenuItem("Replace");       //Quit
      item.addActionListener( fmh );
      editMenu.add( item );

      menuBar.add(editMenu);
    
   }
} //SSNGUI