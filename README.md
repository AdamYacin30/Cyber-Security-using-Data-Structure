# CyberSec Passcode Guessing Game

## Overview
This project is an implementation of a cybersecurity passcode guessing game as part of the CS 1027B course. 
The primary goal of this game is to guess a mystery 5-character passcode within six attempts. 
Each guess provides feedback on how close it is to the actual passcode, helping refine future guesses.

## Features
- **Building a subclass**: Learn to create subclasses and override methods.
- **Overriding methods**: Implement method overriding to customize functionality.
- **Instanceof checks**: Use `instanceof` to ascertain the class of an Object.
- **Generics**: Apply generics for type-safe data structures.
- **Linked data structures**: Manage data using linked lists.
- **Loops and conditionals**: Utilize loops and conditional statements effectively.

## Game Mechanics
- Each character in the guessed word is labeled as either correct, used, or unused.
- Feedback is given for each guess, guiding the player towards the correct passcode.
- The game is text-based and non-graphical.

## Provided Files
- **LinearNode.java**: Node class used in linked list structures.
- **Letter.java**: Represents a single letter in the game with status labels.
- **Word.java**: Represents a word composed of Letter objects, stored in a linked list.
- **WordLL.java**: Main class managing the game's mystery word and guess history.
- **ExtendedLetter.java**: Subclass of Letter with additional functionalities.
- **TestWordLL.java**: Test cases to validate the WordLL implementation.
- **WordLLExamples.java**: Example usage of the WordLL class.
- **words**: A text file containing a list of words for the game.

## Installation
1. Ensure you have Java installed on your machine.
2. Place all the provided files in the same directory.
3. Compile the Java files using the following command:
   ```sh
   javac *.java
