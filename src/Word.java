/**
 * 
 * @author Ayaci
 * @version 07/12/2023
 */
public class Word {
	/**
	 * Attribute declarations
	 */
	private LinearNode<Letter> firstLetter;

	public Word(Letter[] letters) {
		/**
		 * constructor used to store the letter objects in the array 'letters'
		 * 
		 * @param letters
		 */
		for (int i = letters.length - 1; i >= 0; i--) { // iterate through the letters array and add each object to it
			LinearNode<Letter> newNode = new LinearNode<>(letters[i]);
			newNode.setNext(firstLetter); // set the newNode to the next node after first letter
			firstLetter = newNode;
		}
	}

	public String toString() {
		/**
		 * toString method used to produce a string of the word that was guessed
		 */
		StringBuilder strBuild = new StringBuilder("Word: ");
		LinearNode<Letter> curr = firstLetter; // set current to the first letter of the linked list
		while (curr != null) { // keep appending the curr node to the string builder until the list reaches null
			strBuild.append(curr.getElement().toString());
			strBuild.append(" ");
			curr = curr.getNext(); // this is done by calling the getNext method each time until it reaches null; then the loop terminates
		}

		return strBuild.toString();
	}

	public boolean labelWord(Word mystery) {
		/**
		 * labelWord method used to compare our word with the mystery word and label the
		 * letter of the word object with the decorators using the setter methods in
		 * letter.java
		 * @param mystery
		 * @return
		 */
		LinearNode<Letter> curr = firstLetter; // create a curr object that equals to the first letter
		int countWord = 0; // create a counter for word to keep track of the index of letters list

		while (curr != null) {
			LinearNode<Letter> mysteryCurr = mystery.firstLetter; // create a current variable for mystery object
			int countMystery = 0; // create a second counter for the mystery object

			Letter currNode = curr.getElement(); // create a letter object for the curr variable that represents the element inside the node
			currNode.setUnused(); 	// ^^ set it to unused as of now

			while (mysteryCurr != null) {
				Letter mysteryNode = mysteryCurr.getElement(); // create the letter object for the mystery variable that represents the element data inside that node

				if (currNode.equals(mysteryNode)) { // if the elements of currNode and mysetryNode are the same and their count index is the same
					if (countWord == countMystery) {
						currNode.setCorrect(); // set the currNode to Correct ^^
					} else {
						currNode.setUsed(); // otherwise set the currNode to Used
					}

					if (countMystery >= countWord) { // if the countMystery is greater than the count word then break and set the curr to next and go over the loop again
						break;
					}
				}

				mysteryCurr = mysteryCurr.getNext(); // otherwise set the mysteryCurr to the next node and increase the count variable for mystery
				countMystery++;
			}

			curr = curr.getNext(); 
			countWord++;
		}

		return toString().equals(mystery.toString());
	}

}
