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
import java.awt.event.*;
import java.io.*;

public class FileMenuHandler implements ActionListener {

    JFrame jframe;

    public FileMenuHandler(JFrame jf) {
        jframe = jf;
    }

    public void actionPerformed(ActionEvent event) {
        String menuName = event.getActionCommand();
        if (menuName.equals("Open")) {
            JOptionPane.showMessageDialog(null, "You clicked on Open");
        } else if (menuName.equals("Quit")) {
            JOptionPane.showMessageDialog(null, "You clicked on Quit");
        } else if (menuName.equals("Find")) {
            JOptionPane.showMessageDialog(null, "You clicked on Find");
        } else if (menuName.equals("Replace")) {
            JOptionPane.showMessageDialog(null, "You clicked on Replace");
        }
    } //actionPerformed
}
