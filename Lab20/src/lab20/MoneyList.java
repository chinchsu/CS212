/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab20;

/**
 *
 * @author chin_
 */
public class MoneyList {
    /** First node in linked list - dummy node */
	private MoneyNode first = new MoneyNode(null);

	/** Last node in linked list */
	private MoneyNode last = first;

	/** Number of data items in the list. */
	private int length = 0;

	/**
	 * Gets the number of data values currently stored in this MoneyList.
	 * 
	 * @return the number of elements in the list.
	 */

	public int getLength() {
		return length;
	}

	/**
	 * Appends a String data element to this MoneyList.
	 * 
	 * @param data
	 *            the data element to be appended.
	 */
	public void append(Money d) {
            MoneyNode temp = new MoneyNode(d);
            last.next = temp;
            last = temp;
            length++;
          // TODO Code here for append

	} // method append(String)

	/**
	 * Prepends (adds to the beginning) a String data element to this
 MoneyList.
	 * 
	 * @param data
	 *            the data element to be prepended.
	 */
	public void prepend(Money d) {
            MoneyNode temp = new MoneyNode(d);
            temp.next = first.next;
            first.next = temp;
            length++;
        // TODO Code here for prepend

	} // method append(String)

	/**
	 * @return String representation of elements in linked list delimited by a
	 *         space character
	 */
	public String toString() {
		MoneyNode p = first.next;
		String returnString = "";
		while (p != null) {
			returnString += p.data + " ";
			p = p.next;
		}
		return returnString;
	}
        public String getValue(){
            String value = "";
            int B = 0;
            int c = 0;
            MoneyNode temp = first.next;
            while(temp != null){
                if(temp.data instanceof Bill){
                    B += temp.data.getValue();
                    temp = temp.next;
                }
                if(temp.data instanceof Coin){
                    c += temp.data.getValue();
                    temp = temp.next;
                }
            }
            if( c >= 100){
                B += 1;
                c -= 100;
            }
            value = B+"."+c;
            return value;
        }
	/**
	 * Determines whether this ShortSequenceLinkedList is equal in value to the
	 * parameter object. They are equal if the parameter is of class
	 * ShortSequenceLinkedList and the two objects contain the same short
	 * integer values at each index.
	 * 
	 * @param other
	 *            the object to be compared to this ShortSequenceLinkedList
	 * 
	 * @return <code>true</code> if the parameter object is a
	 *         ShortSequenceLinkedList containing the same numbers at each index
	 *         as this ShortSequenceLinkedList, <code>false</code> otherwise.
	 */
	public boolean equals(Object other) {
		if (other == null || getClass() != other.getClass()
				|| length != ((MoneyList) other).length)
			return false;

		MoneyNode nodeThis = first;
		MoneyNode nodeOther = ((MoneyList) other).first;
		while (nodeThis != null) {
			// Since the two linked lists are the same length,
			// they should reach null on the same iteration.

			if (nodeThis.data != nodeOther.data)
				return false;

			nodeThis = nodeThis.next;
			nodeOther = nodeOther.next;
		} // while

		return true;
	} 
}
