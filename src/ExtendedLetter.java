/**
 * 
 * @author Ayaci
 * @version 07/11/2023
 */
public class ExtendedLetter extends Letter {
	/**
	 * Attribute declarations
	 */
	private String content; // instantiate private variables
	private int family;
	private boolean related;
	private final int SINGLETON = -1;

	public ExtendedLetter(String s) {
		/**
		 * Constructor used to initialize instance variables
		 * @param s
		 */
		super('c'); // call an arbitrary letter from the superclass
		this.content = s;
		this.related = false;
		this.family = SINGLETON;
	}

	public ExtendedLetter(String s, int fam) {
		/**
		 * Second constructor used initialize instance variable however the method has two parameters
		 * @param s
		 * @param fam
		 */
		super('c');
		this.related = false;
		this.family = fam;
		this.content = s;
	}

	@Override
	public boolean equals(Object other) {
		/**
		 * equals method used to check if the parameter object is an instance of ExtendedLetter
		 */
		if (other instanceof ExtendedLetter) { 
			ExtendedLetter newContent = (ExtendedLetter) other; // create a new ExtendedLetter object that casts to the other variable
			if (newContent.family == this.family) { // if the object is the same as the family variable set the related variable to true
				this.related = true;
			if (newContent.content.equals(this.content)) { // if the content of the new object is the same as 'this' content
				return true; // return true ^
				}
			}
		}
		return false; // otherwise return false
	}


	public String toString() {
		/**
		 * toString method used to produce a string representation of the ExtendedLetter object
		 */

		if (isUnused() && this.related == true) { // if letter is unused, return a string with the format '.letter.'
			return "." + this.content + ".";
		} else {
			return decorator() + this.content + decorator();
		}
	}


	public static Letter[] fromStrings(String[] content, int[] codes) {
		/**
		 * fromStrings method used to create an array that stores the letter objects from ExtendedLetter
		 * @param content
		 * @param codes
		 * @return letterArr
		 */
		Letter[] letterArr = new Letter[content.length]; // create a new array
		for (int i = 0; i < content.length; i++) { // loop through the array  
			if (codes == null) {
				String contentObj = (String) content[i]; // create (cast) a content object of type String to be parsed into the constructor when called
				letterArr[i] = new ExtendedLetter(contentObj); // if codes is null store the object into the array using the first constructor
			} else {
				String contentObj = (String) content[i];
				int codesObj = (int) codes[i]; // create (cast) a code variable of type int to be allowed to be called in the second constructor
				letterArr[i] = new ExtendedLetter(contentObj, codesObj); // otherwise store the object into the array using the second constructor
			}
		}
		return letterArr; // return the array of letter
	}

}
