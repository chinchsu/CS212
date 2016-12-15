/*
 * Chin-Chuan Hsu
 * Project 1
 * CSCI 212-11G
 * LAB (42708)
 */
package project1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class DateGUI extends JFrame {

    private static File file; // file to parse
    JPanel panel = new JPanel();
    static JTextArea textArea1 = new JTextArea(5, 20); // text area left
    static JTextArea textArea2 = new JTextArea(5, 20); // text area right
    static String[] parseData; // usable data
    static private int counter = 0; //size of array

    // start GUI
    DateGUI() {
        super("DATE SORTER");
        createMenuBar();
        createPanel();
        add(panel);
        setSize(500, 500);
        setLocation(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // panel look
    private void createPanel() {
        panel.setLayout(new GridLayout(1, 2, 3, 3));
        panel.add(textArea1);
        textArea1.setMargin(new Insets(5, 5, 5, 5));
        panel.add(textArea2);
    }

    // creates menu
    private void createMenuBar() {

        JMenuBar menubar = new JMenuBar();
        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);

        JMenuItem menuItemOpen = new JMenuItem("Open");
        menuItemOpen.setMnemonic(KeyEvent.VK_O);
        menuItemOpen.addActionListener(new openFile());
        JMenuItem menuItemExit = new JMenuItem("Exit");
        menuItemExit.setMnemonic(KeyEvent.VK_E);
        menuItemExit.setToolTipText("Exit");
        menuItemExit.addActionListener(new exitApp());

        file.add(menuItemOpen);
        file.add(menuItemExit);
        menubar.add(file);

        setJMenuBar(menubar);
    }

    /* @param sort() Sorts Input Stream dates */
    private static void sort() {
        int min;
        for (int i = 0; i < counter; i++) {
            min = i;
            for (int h = i + 1; h < counter; h++) {
                if (Integer.parseInt(parseData[h]) < Integer.parseInt(parseData[min])) {
                    min = h;
                }
            }
            if (min != i) {
                final String temp = parseData[i];
                parseData[i] = parseData[min];
                parseData[min] = temp;
            }
        }
    }

    // @param printTextArea1() prints data to textArea1
    private static void printTextArea1() {
        textArea1.append("UNSORTED DATA:\n");
        for (int i = 0; i < counter; i++) {
            textArea1.append(parseData[i] + "\n");
        }
    }

    // @param printTextArea2() prints data to textArea2
    private static void printTextArea2() {
        textArea2.append("SORTED DATA:\n");
        for (int i = 0; i < counter; i++) {
            textArea2.append(parseData[i] + "\n");
        }
    }

    // check to see if string is numeric
    private static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }
    // reads the file
    private static void readFile() {
        //get array size
        try {
            Scanner sc = new Scanner(file).useDelimiter(",|\\n|\\s");
            while (sc.hasNext()) {
                String temp = sc.next();
                if (temp.length() == 8 && isNumeric(temp)) {
                    counter++;
                }
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        // input to array
        try {
            Scanner sc = new Scanner(file).useDelimiter(",|\\n|\\s");
            int count = 0;
            parseData = new String[counter];
            while (sc.hasNext()) {
                String temp = sc.next();
                if (temp.length() == 8 && isNumeric(temp)) {
                    parseData[count++] = temp;
                } else {
                    System.out.println(temp);
                }
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }

    }

    // open file reads the file and calls display output functions as well as sorting
    static class openFile implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            final JFrame frame = new JFrame("Open File");
            final JFileChooser fc = new JFileChooser();
            int returnVal = fc.showOpenDialog(frame);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                file = fc.getSelectedFile();
                System.out.println("File: " + file.getName() + ".");
                textArea1.setText(""); // clear text area
                textArea2.setText(""); // clear text area
                readFile();
                printTextArea1();
                sort();
                printTextArea2();
            } else {
                System.out.println("Open command cancelled by user.");
            }
            System.out.println(returnVal);
        }
    }

    // exits program
    static class exitApp implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}
