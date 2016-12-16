/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab25;

/**
 *
 * @author chin_
 */
public class Lab25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
		int[] intArray = { 3, 5, 9, 4, 10, 33, 12, 19, 4, 16, 23, 30 };
		int[] intArray1 = { 1, 2, 4, 5, 5, 6, 7, 8, 9, 100 };

		System.out.println(largest(intArray, 0));
		System.out.println(sum(intArray, 0));
		System.out.println(isSorted(intArray, 0));
		System.out.println(isSorted(intArray, 8));
		System.out.println(isSorted(intArray1, 0));
	}

	public static int largest(int[] myArray, int index) {
            int l = 0;
            for(int i: myArray){
                if(i > l){
                    l = i;
                }
            }
            return l;
	}

	public static int sum(int[] myArray, int index) {
            int sum = 0;
            for(int i = 0; i < myArray.length; i++){
                sum += myArray[i];
            }
            return sum;
	}

	public static boolean isSorted(int[] myArray, int index) {
            int i = 0;
            while(i < myArray.length-1){
                if(myArray[i+1] >= myArray[i]){
                    if(i == myArray.length-2){
                        return true;
                    }
                    i++;
                }
                else{
                    i = myArray.length;
                    return false;
                }
            }
            return false;
        }

}
