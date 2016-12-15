/**
 *
 * @author Chin-Chuan Hsu
 * @Lab Section CSCI 212-11G LAB (42708)
 * @Project 0
 */
package project0;

import javax.swing.JOptionPane;

public class Project0{

    public static void main(String[] args) {
        int repeatControl = -1; // Control integer for while loop
        // while loop to stop running program
        while(repeatControl<0){
            String input = JOptionPane.showInputDialog("Please enter a sentence: ");
            // if input string is stop repeatControler int will = 0 stopping loop
            if(input.equalsIgnoreCase("Stop")){
                repeatControl++;
                System.out.println("Stop Command Executed");
            }
            else{
                int lowerCaseE = 0; // lower case count
                int upperCaseE = 0; // upper case count
                // run through string looking for E and e's
                for(int i = 0; i<input.length(); i++){
                    if (input.charAt(i)== 'E'){
                        upperCaseE++;
                    }
                    if (input.charAt(i)== 'e'){
                        lowerCaseE++;
                    }
                }
                // displays info on upper and lower case counts
                JOptionPane.showMessageDialog( null, "Number of lower case e's: "+ lowerCaseE +"\nNumber of upper case e's: "+ upperCaseE, "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
}
