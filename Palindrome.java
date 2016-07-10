import java.util.Scanner;

public class Palindrome {

	/**
	 * This main function accepts a string from the user, checks
	 * if this string is a palindrome using Stacks and Queues, and then
	 * displays the result. 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		String text; 
		System.out.println("Enter a string:");
		text = input.nextLine();
		
		if (isPalindrome(text))
		{
			System.out.println("The string '" + text +"' is a Palindrome!");
		}
		else
		{
			System.out.println("The string '" + text + "' is NOT a Palindrome!");
		}
		
	}
	
	/**
	 * This function calls the addTextToStackQueue function 
	 * which adds the in put text into a stack and queue. 
	 * Then this function checks if the in put text is a palindrome
	 * using the stack pop method and queue dequeue method.
	 * @param text: the string the user provided.  
	 * @return: True if the in put text is a palindrome. False 
	 * otherwise. 
	 */
	public static boolean isPalindrome(String text)
	{
		Stack stack = new Stack();
		Queue queue = new Queue();
		
		int count = addTextToStackQueue(stack, queue, text); //the number of elements added to the stack/queue
		
		for (int i=0; i<count; i++)
		{
			if (stack.pop() != queue.dequeue())
			{
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * This function adds the text into the stack and queue by 
	 * iterating through the text. If the char is a space it continues
	 * onto the next char in the text. If the char is not a space
	 * it calls the addNonSpaceCharToStackQueue function which adds 
	 * the non-space char to the stack and queue.
	 * @param stack: the stack 
	 * @param queue: the queue
	 * @param text: the string the user provided. 
	 * @return: the number of elements added to the stack and queue
	 */
	public static int addTextToStackQueue(Stack stack, Queue queue, String text)
	{
		int count = 0;
		for (int i=0; i<text.length(); i++)
		{
			char element = text.charAt(i);
			if (!Character.isSpaceChar(element))
			{
				addNonSpaceCharToStackQueue(stack, queue, element);
				count++;
			}	
		}
		return count;
	}
	
	
	/**
	 * This function adds a non-space char to the stack and the
	 * queue. If the char is a letter, it first changes the letter
	 * to lower case and then adds the char to the stack and queue. 
	 * @param stack: the stack
	 * @param queue: the queue
	 * @param element: the char to be added to the stack and queue
	 */
	public static void addNonSpaceCharToStackQueue(Stack stack, Queue queue, char element)
	{
		if(Character.isLetter(element))
		{
			element = Character.toLowerCase(element);
		}
		stack.push(element);
		queue.enqueue(element);
	}
			
	
			

}
