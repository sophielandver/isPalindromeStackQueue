import java.util.NoSuchElementException;



public class Queue {
	
	private Node front;
	private Node rear;
	
	
	/**
	 * Constructor for Queue. Setting front and rear to null. 
	 */
	public Queue(){
		front = null;
		rear = null;
	}
	
	/**
	 * This method adds an item to the rear of the queue. 
	 * @param item: char
	 */
	public void enqueue(char item)
	{
		Node newNode = new Node(item);
		if (isEmpty()) 
		{
			front = rear = newNode;
		}
		
		else
		{
			rear._next = newNode;
			rear = newNode;
		}
	}
	
	/**
	 * This method removes an item from the front of the queue and
	 * returns it. 
	 * @return: char
	 */
	public char dequeue()
	{
		if (front == null)
		{
			throw new NoSuchElementException();
		}
		
		char returnItem = front._data;
		front = front._next;
		if (front == null)
		{
			rear = null;
		}
		return returnItem;
	}
	
	/**
	 * This method checks if the queue is empty. 
	 * @return: True iff front is equal to null. 
	 */
	public boolean isEmpty()
	{
		return (front == null);
	}
	
	

}

