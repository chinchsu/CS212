/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14;

/**
 *
 * @author chin_
 */
public class Money implements Comparable<Money> {
	
	private int dollars, cents;
	
	/**
	 * Constructor makes a call to {@link #Money(int, int)} 
	 * with (0,0) as parameters
	 */
	public Money() {
		this(0,0);
	}
	
	public Money(int dollars, int cents) {
		this.dollars = dollars;
                this.cents = cents;
	}
	
	

	/**
	 * @param args
	 */
	

	public void add(Money other) {
		// TODO Fill this in
		// Hint: Add the cents first, check if you surpass 100 (check hint from 2-arg constructor),
		// then add dollars
                int tempCents = 0;
                tempCents = other.getCents()+this.cents;
                while(tempCents > 100){
                    dollars += 1;
                    tempCents -= 100;
                }
                cents = tempCents;
                dollars += other.getDollars();
	}

	@Override
	public int compareTo(Money other) {
		// TODO Fill this in
		/*
		 * Steps:
		 * 1) Test the dollars in both first
		 * 2) If dollar values are equal, test
		 * cents in both
		 * 3) If both dollars and cents are equal return 0
		 * 
		 * Hint: compareTo can be viewed as a subtraction operation
		 */
                if(dollars < other.getDollars()){
                    if(cents < other.getCents()){
                        return -1;
                    }
                }
                else if(dollars > other.getDollars()){
                    if(cents > other.getCents()){
                        return 1;
                    }
                }
                else if(dollars == other.getDollars()){
                    if(cents == other.getCents()){
                        return 0;
                    }
                }
                return 0;
	}
	
	@Override
	public boolean equals(Object other) {
		// TODO Fill this in
		/*
		 * Steps:
		 * 1) Test if other is null
		 * 2) Test if other is of type Money
		 * 3) If the above tests pass, then cast other into
		 * type Money
		 * 4) Compare dollar and cents in both. 
		 * If equal return true, otherwise return false
		 */
		if (this == other) return true;
		if(other!=null && this.getClass().equals(other.getClass())) {
			Money temp = (Money) other;
                        if(temp.getCents() == this.cents){
                            return true;
                        }
		}
                return false;
	}
	
	@Override
	public String toString() {
		String c;
		if(cents<10) {
			c = "0" + cents;
		} else {
			c = "" + cents;
		}
		return "$ " + dollars + "." + c;
	}
	
	public int getCents() {
		return cents;
	}
	
	public int getDollars() {
		return dollars;
	}

}
