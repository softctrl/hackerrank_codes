import java.io.*;
import java.util.*;

public class Solution {
	// Write your code here.
	public Stack stack = new Stack();

	public Queue queue = new LinkedList();

	/**
	 * A void pushCharacter(char ch) method that pushes a character onto a stack.
	 * @param c
	 */
	public void pushCharacter(char c) {
		stack.push(c);
	}

	/**
	 * A void enqueueCharacter(char ch) method that enqueues a character in the queue instance variable.
	 * @param c
	 */
	public void enqueueCharacter(char c) {
		queue.add(c);
	}

	/**
	 * A char popCharacter() method that pops and returns the character at the top of the stack instance variable
	 * @return
	 */
	public char popCharacter() {
		return (char) stack.pop();
	}

	/**
	 * A char dequeueCharacter() method that dequeues and returns the first character in the queue instance variable
	 * @return
	 */
	public char dequeueCharacter() {
		return (char) queue.remove();
	}
	
	    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
