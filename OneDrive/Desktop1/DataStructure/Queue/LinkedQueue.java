package Lec14.Queue.LinkedQueue.Anytype;

/**
 * Author: 			Khaled Ghosn
 * LastModified:	23/03/2017
 * 
 * Attributes:
 *  - Node		Front
 *  - Node		Back
 *  - int		Size
 *  
 * Operations:
 *  + 			LinkedQueue				( )							Time Complexity: O(1)
 *  + boolean 	isEmpty    				( )							Time Complexity: O(1)
 *  + void 		makeEmpty  				( )							Time Complexity: O(1)
 *  + int 		Length  				( )							Time Complexity: O(1)
 *  + Anytype 	getFront  				( )							Time Complexity: O(1)
 *  + void	 	Enqueue	  				( Anytype value )			Time Complexity: O(1)
 *  + Anytype	Dequeue					( )							Time Complexity: O(1)
 *  + void 		Print  					( )							Time Complexity: O(N)
 */

public class LinkedQueue < Anytype > 
{
	private Node < Anytype > Front; // Ptr to the front of the Queue
	private Node < Anytype > Back;  // Ptr to the rear of the Queue
	private int Size;
	
	// create an empty LinkedQueue
	public LinkedQueue()
	{
		  Front = Back = null;
		  Size = 0;
	}
	
	// Returns true if the Queue is empty
	public boolean isEmpty()
	{
		return Front == null;
		// return Size == 0;
	}
	
	// make the Queue empty
	public void makeEmpty()
	{
		Front = Back = null;
		Size = 0;
	}
	
	public int Length()
	{
/**  if variable Size does not exist:
  		int Size=0;
  		Node cn=Front;
  		while(cn!=null)
  		{
  			cn = cn.getNextNode();
  			Size++;
  		}
*/	

		return Size;
	}
	
	// return the value from the top of the non-empty QueueNode without removing it
	public Anytype getFront()
	{
		if (isEmpty())
			throw new RuntimeException();
		
		return Front.getData();
	}
	
	// Inserts a new item into the queue by adding a Node (having a value) to the end of the LinkedQueue
	public void Enqueue(Anytype value)
	{
		// Allocate a QueueNode for the item
		Node < Anytype > newNode = new Node < Anytype > (value);

		if (isEmpty())
			Front = Back = newNode;
		else 
		{
			Back.setNextNode(newNode);
			Back = newNode;
		}
		
		Size++;
	} 

	// Removes and returns the item at the front of the queue
	public Anytype Dequeue()
	{
		  if (isEmpty())
			  throw new RuntimeException();

		  Anytype removedValue = Front.getData();	
		  if (Front == Back)		// if (Size == 1)
			  Front = Back = null;
		  else 
			  Front = Front.getNextNode();
		  
		  Size--;
		  return removedValue;

//		  if (isEmpty())
//			  throw new RuntimeException();
//		  Node < Anytype > removedNode = Front;   // Keep a ptr to the front node
//		  Front = Front.getNextNode();    		  // Remove the front node
//		  Size--;		  
//		  if (Front == null)	// if (Size==0) // if(isEmpty()) 
//			  Back = null;		// makeEmpty();
//		  return removedNode.getData();
	}

	public void Print()
	{
		if(isEmpty())
			System.out.println("The Queue is empty");
		else
		{
			Node < Anytype > currentNode = Front;
			
			while (currentNode!=null){
				System.out.print(currentNode.getData().toString() + " --> ");
				currentNode = currentNode.getNextNode();
			}
			System.out.println("");
		}
	}
}