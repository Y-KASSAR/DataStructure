package sll;

public class SLLNode
{
	private int Data;
	private SLLNode NextNode;
	
	/* 
	 * Constructs a new Node for a Single Linked List 
	 */
	public SLLNode(int value)
	{
		this(value, null);
	}
	
	public SLLNode(int value, SLLNode next)
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
	
	public SLLNode getNextNode()
	{
		return NextNode;
	}
	
	public void setNextNode(SLLNode next)
	{
		NextNode = next;
	}
	
	public void Print()
	{
		System.out.println(Data);
	}
}
