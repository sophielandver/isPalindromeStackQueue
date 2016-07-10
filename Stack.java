import java.util.EmptyStackException;


public class Stack {
	
	private Node top;
	
	/**
	 * Constructor for Stack. Setting top to null. 
	 */
	public Stack(){
		top= null;
	}
	
	/**
	 * This method removes the top of the stack and returns it. 
	 * @return: the top of the stack
	 */
	public char pop()
	{
		if (top == null)
		{
			throw new EmptyStackException();
		}
		char returnItem = top._data;
		top = top._next;
		return returnItem;
	}
	
	/**
	 * This method adds an item to the top of the stack. 
	 * @param item: char
	 */
	public void push(char item)
	{
		Node newNode = new Node(item);
		newNode._next = top;
		top = newNode;
	}
	
	/**
	 * This method checks if the stack if empty. 
	 * @return: True iff top is equal to null. 
	 */
	public boolean isEmpty()
	{
		return (top == null);
	}

}
