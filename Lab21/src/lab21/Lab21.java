/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab21;

/**
 *
 * @author chin_
 */
import java.io.File;
import javax.swing.*;
public class Lab21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFileChooser fd = new JFileChooser("C:\\Users\\chin_\\desktop");
//        mode - the type of files to be displayed:
//            * JFileChooser.FILES_ONLY
//            * JFileChooser.DIRECTORIES_ONLY
//            * JFileChooser.FILES_AND_DIRECTORIES 
        fd.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fd.showOpenDialog(null);
		File f = fd.getSelectedFile();
		listFiles(f,"");

	}
	public static void listFiles(File f, String indent) {
		File files[] = f.listFiles();
		File largestFile = null;
                long length = 0;
		for (int i = 0; i<files.length; i++) {
			File f2 = files[i];
			if(f2 != null){
                            long temp = f2.length();
                            if(temp > length){
                                length = temp;
                                largestFile = f2;
                            }
                        }
                    if (f2.isDirectory())
                        listFiles(f2, indent+"   ");
                }
                if(largestFile != null){
                System.out.println("The Largest File is "+largestFile.getName());
                }
	}
}
