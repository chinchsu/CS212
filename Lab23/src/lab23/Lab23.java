/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab23;

/**
 *
 * @author chin_
 */
public class Lab23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		System.out.println(isPalindrome("noon"));
		System.out.println(isPalindrome("Madam I'm Adam"));
		System.out.println(isPalindrome("A man, a plan, a canal, Panama"));
		System.out.println(isPalindrome("A Toyota"));
		System.out.println(isPalindrome("Not a palindrome"));
		System.out.println(isPalindrome("asdfghfdsa"));
	}
	
	public static boolean isPalindrome(String in) {
		if(in==null) {
			return false;
		}
                in = in.replace(",", "");
                in = in.replace(" ", "");
		return isPalindromeHelper(in.toUpperCase());
	}
	
	private static boolean isPalindromeHelper(String in) {    
            if(in.length() == 0 || in.length() == 1){
                return true; }
            if(in.charAt(0) == in.charAt(in.length()-1)){
                return isPalindromeHelper(in.substring(1, in.length()-1));
                
            }
        return false;
	}
    
}
