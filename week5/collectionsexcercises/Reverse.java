package week5.collectionsexcercises;


import java.util.*;

class Reverse{

  public String reverse(String word) {
	    Stack<String> stack = new Stack<String>();
	    String[] letters = word.split("");
	    String reverse = "";

	    for(String letter : letters) {
	      stack.push(letter);
	    }

	    while(!stack.empty()) {
	      reverse += stack.pop();
	    }

	    return reverse;
	  }

  public static void main(String args[]) {
	  Reverse rw = new Reverse();
	  String word = "school";
	  System.out.println(rw.reverse(word));
	  // A joke word meaning "fear of palindromes"
	  String anotherWord = "aibohphobia";
	  System.out.println(rw.reverse(anotherWord));
	}
}
