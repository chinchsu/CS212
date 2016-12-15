/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;

public class FileHandlerMenu implements ActionListener {
   JFrame jframe;
   public FileHandlerMenu (JFrame jf) {
      jframe = jf;
   }
   //actionPerformed
   public void actionPerformed(ActionEvent event) {
      String  menuName;
      menuName = event.getActionCommand();
      if (menuName.equals("Open"))
         openFile( ); 
      else if (menuName.equals("Quit"))
         System.exit(0);
   } 

    // open
    private void openFile( ) {
       JFileChooser chooser = new JFileChooser( );
       int status = chooser.showOpenDialog(null);
       if (status == JFileChooser.APPROVE_OPTION) 
          readSource(chooser.getSelectedFile());
       else 
          JOptionPane.showMessageDialog(null, "Open File dialog canceled");
    }
    // read and dump to UD and SD in Project3
    private void readSource(File chosenFile) {
        TreeMap<Date212, String> treeMap = new TreeMap<>(new Date212Comparator());
        try {
            Scanner sc = new Scanner(chosenFile).useDelimiter(",|\\n|\\s");
            while (sc.hasNext()) {
                String temp = sc.next();
                Project4.SD.add(temp);
                
                if (temp.length() == 8 && isNumeric(temp)) {
                    Date212 t = new Date212(temp);
                    treeMap.put(t, "sorted");
                }
            }
            for(Map.Entry me : treeMap.entrySet()){ //for each entry in the map's entry set
                DateGUI.textArea2.append(""+me.getKey()+"\n"); // send to textarea
            }
            
            
            DateNode temp = Project4.SD.first;
            while(temp != null){
                DateGUI.textArea1.append(temp.data.toString() + "\n");
                temp = temp.next;
            }
            /*
            DateNode temp = Project4.UD.first;
            while(temp != null){
                DateGUI.textArea1.append(temp.data.toString() + "\n");
                temp = temp.next;
            }
            */
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    private static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }
}
