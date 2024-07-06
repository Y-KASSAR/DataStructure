package Lec14.Queue.LinkedQueue.Anytype;

/**
 * Author: 			Khaled Ghosn
 * LastModified:	29/11/2015
 * 
 * Attributes:
 *  - Anytype	Data
 *  - SLLNode	NextNode
 *  
 * Operations:
 * 	+ 			Node		( Anytype value )
 * 	+ Anytype 	getData    	( )
 * 	+ void 		setData    	( Anytype value )
 * 	+ SLLNode 	getNextNode	( )
 * 	+ void 		setNextNode	( Node NextNode )
 * 	+ void		Print     	( )
 */

public class Node <Anytype>
{
	private Anytype Data;
	private Node<Anytype> NextNode;
		
	public Node(Anytype value)
	{
		this(value, null);
	}
		
	public Node(Anytype value, Node<Anytype> next)
	{
		Data = value;
		NextNode = next;
	}
		
	public Anytype getData()
	{
		return Data;
	}
		
	public void setData(Anytype value)
	{
		Data = value;
	}
	
	public Node<Anytype> getNextNode()
	{
		return NextNode;
	}
		
	public void setNextNode(Node<Anytype> next)
	{
		NextNode = next;
	}
		
	public void Print()
	{
		System.out.println(Data.toString());
	}
}
