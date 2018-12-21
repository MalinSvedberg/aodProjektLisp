package se.hig.aod.projekt;


import java.util.Stack;

/**
 * En klass som använder sig av en stack för att kontrollera parentesuttryck.
 * Modifierad av Malin Svedberg 2018-11-21
 * 
 * @author Magnus Blom, Peter Jenke
 * @version 2014-01-16
 */
public class CheckBalance
{
	public static boolean isBalanced (String uttryck)
	{
		Stack<Character> charStack = new Stack<> (); // Skapa en ny stack
		char aChar;		
		int i = 0;
		boolean balanserad = true;

		// Kod enligt algoritmen-beskrivning på s. 4 implementerad av Malin Svedberg
		while (balanserad==true && uttryck.length()>i) {
			
			aChar = uttryck.charAt(i);
			if(aChar == '(') 
				charStack.push(aChar);
			else if(aChar== ')') {
				if(!charStack.isEmpty())
					charStack.pop();
				else
					balanserad= false;
			}
			i++;
		}
		if(!charStack.isEmpty() && balanserad==true)
			balanserad = false;
		
		charStack.clear();

		return balanserad;
	}

} // end of class CheckBalance
