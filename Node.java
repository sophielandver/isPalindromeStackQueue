
public class Node {
	public char _data;
	public Node _next;
	
	/**
	 * This is a constructor given char data and Node next.
	 * @param data: char
	 * @param next: the next Node
	 */
	public Node(char data, Node next)
	{
		_data = data;
		_next = next;
	}
	
	
	/**
	 * This is a constructor given char data and no next Node. Thus 
	 * next will be initialized to null. 
	 * @param data: char
	 */
	public Node(char data)
	{
		_data = data;
		_next = null; 
	}
	
	
	/**
	 * Getter method for instance variable _data
	 * @return: _data instance variable 
	 */
	public char get_data() {
		return _data;
	}
	
	
	/**
	 * Setter method for instance variable _data
	 * @param _data: char
	 */
	public void set_data(char _data) {
		this._data = _data;
	}
	
	
	/**
	 * Getter method for instance variable _next
	 * @return: _next instance variable
	 */
	public Node get_next() {
		return _next;
	}
	
	
	/**
	 * Setter method for instance variable _next 
	 * @param _next: Node
	 */
	public void set_next(Node _next) {
		this._next = _next;
	}
	
}