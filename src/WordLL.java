/**
 * 
 * @author Ayaci
 * @version 07/12/2023
 */

	/**
	 *I first went over the assignment instructions and thoroughly read through the requirements 
	 *to excel in this assignment. After that, I decided to create a draft on paper of how the 
	 *algorithm should look like in Pseudo code and watched videos about how programs like this 
	 *assignment work (Wordle). I then started coding all the methods on Eclipse and then started 
	 *writing the algorithms for each method. Near the end of the assignment, I was struggling 
	 *trying to understand the logic of the method labelWord() which cost me a good amount of time 
	 *for this assignment. I then went into a lab consulting call and was enlightened by the process 
	 *of how i should go about coding this method. The main part I was struggling to understand was 
	 *iterating through each letter of the node and comparing it to the mystery node letter and 
	 *setting it to each used or unused. But thankfully after pushing through a late night of 
	 *coding, I managed to pass the tests and my code finally worked
	 */

public class WordLL {
	/**
	 * Attribute declarations
	 */
	private Word mysteryWord; // instantiate private variables
	private LinearNode<Word> history;

	public WordLL(Word mystery) {
		/**
		 * constructor used to initialize the instance variables
		 * @param mystery
		 */
		this.history = null;
		this.mysteryWord = mystery;
	}

	public boolean tryWord(Word guess) {
		/**
		 * tryWord method used to test if the users guess is the same as the mystery word
		 * @param guess
		 * @return true
		 * @reutrn false
		 */
		guess.labelWord(mysteryWord);
		if (guess.equals(mysteryWord)) { // return true if guess is equal to mysteryWord
			return true;
		}
		else {
			// otherwise create a node for the guess variable and place it on the front of the history node
			LinearNode<Word> guessNode = new LinearNode<>(guess); 
			guessNode.setNext(history);
			history = guessNode;
		}
		return false;
	}
	

	public String toString() {
		/**
		 * toString method used to produce a string representation of the past guesses in the history node
		 */
		StringBuilder strBuild = new StringBuilder();
		LinearNode<Word> curr = history; // set curr to history
		while(curr != null) {
			strBuild.append(curr.getElement().toString());
			strBuild.append("\n");
			curr = curr.getNext(); // this will allow us to iterate through the linked list every time until it reaches null
		}
		return strBuild.toString();
	}
	
}
