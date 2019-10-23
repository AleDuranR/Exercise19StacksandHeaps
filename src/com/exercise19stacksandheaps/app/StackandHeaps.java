package com.exercise19stacksandheaps.app;

import java.util.Stack;
public class StackandHeaps {

	public static void main(String[] args) {
		// Variables declaration
		String cad ="Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
		// Object declaration
		Stack <Character> letters = new Stack<Character>(); 
		// Convert the string to an array type char
		char[] lettersArray = cad.toCharArray();
		// Traverse through 'lettersArray' that is the array of my string 'cad'
		for(Character c: lettersArray) {
			// if the char 'c' even though is lower or upper case if is is equal to A
			if(Character.toUpperCase(c) == 'A') {
				// Then push that char into the stack
				letters.push(c);
			}
		}
		// Show my 'Stack' to the end (while the stack is NOT EMPTY)
		while(!letters.isEmpty()) {
			System.out.println(letters.pop());
		}
	}
}
