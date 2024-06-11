/**
 * 
 * @author Ayaci
 * @version 07/11/2023
 */
public class Letter {
	/**
	 * Attribute Declarations
	 */
	private char letter; // instantiate private variables
	private int label;
	private static final int UNSET = 0; // set constants to arbitrary values
	private static final int UNUSED = 1;
	private static final int USED = 2;
	private static final int CORRECT = 3;

	public Letter(char c) {
		/**
		 * Constructor that is used to initialize label and letter variables
		 * 
		 * @param c
		 */
		this.label = UNSET;
		this.letter = c;
	}

	public boolean equals(Object otherObject) {
		/**
		 * equals method to check if object is of the Letter class
		 */
		if (otherObject instanceof Letter) {
			Letter newLetter = (Letter) otherObject;
			if (this.letter == newLetter.letter) { // if letter object is the same as other object return true
				return true;
			}
		}
		return false; // otherwise return false

	}

	public String decorator() {
		/**
		 * Decorator method used to add set the label variable to a symbol based on the
		 * status of the use of the letter
		 *
		 * @return null
		 * @return "+"
		 * @return "-"
		 * @return "!"
		 * @return " "
		 */
		if (label == USED) {
			return "+";
		}
		if (label == UNUSED) {
			return "-";
		}
		if (label == CORRECT) {
			return "!";
		}
		if (label == UNSET) {
			return " ";
		}
		return null;
	}

	public String toString() {
		/**
		 * toString used to represent the letter and label
		 */
		return decorator() + letter + decorator();
	}

	public void setUnused() {
		/**
		 * setter method used to change the value of label to unused
		 */
		label = UNUSED;
	}

	public void setUsed() {
		/**
		 * setter method used to change the value of label to used
		 */
		label = USED;
	}

	public void setCorrect() {
		/**
		 * setter method used to change the value of label to correct
		 */
		label = CORRECT;
	}

	public boolean isUnused() {
		/**
		 * method used to check if label is unused
		 * 
		 * @return true
		 * @return false
		 */
		if (label == UNUSED) { // if label is equal to constant UNUSED return true
			return true;
		}
		return false;
	}

	public static Letter[] fromString(String s) {
		/**
		 * fromString method that produces an array of objects with the string objects
		 * as the items
		 * 
		 * @param s
		 * @return arrLetter
		 */
		Letter[] arrLetter = new Letter[s.length()];
		for (int i = 0; i < s.length(); i++) { // for each letter object that is looped, store it in the array created
		//	System.out.println("in fromString");
			Letter objLetter = new Letter(s.charAt(i));
			arrLetter[i] = objLetter;
		}
		return arrLetter;
	}

}
