package stack;
public class Node
{
	private int Data;
	private Node NextNode;
		
	public Node(int value)
	{
		this(value, null);
	}
		
	public Node(int value, Node next)
	{
		Data = value;
		NextNode = next;
	}
		
	public int getData()
	{
		return Data;
	}
		
	public void setData(int value)
	{
		Data = value;
	}
	
	public Node getNextNode()
	{
		return NextNode;
	}
		
	public void setNextNode(Node next)
	{
		NextNode = next;
	}
		
	public void Print()
	{
		System.out.println(Data);
	}
}