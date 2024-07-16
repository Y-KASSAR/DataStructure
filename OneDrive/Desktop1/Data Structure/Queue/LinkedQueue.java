package queue;

import static java.lang.Math.E;
import static java.lang.StrictMath.E;
import java.util.Queue;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.E;

public class LinkedQueue  
{

   
	private Node  Front; // Ptr to the front of the Queue
	private Node  Back;  // Ptr to the rear of the Queue
	private int Size;
    boolean countodds;
	
	// create an empty LinkedQueue
	public LinkedQueue()
	{
		  Front = Back = null;
		  Size = 0;
		  
		
	}

    LinkedQueue(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
	
	// return the value from the top of the non-empty QueueNode without removing it
	public int getFront()
	{
		if (isEmpty())
			throw new RuntimeException();
		
		return Front.getData();
	}
	
	// Inserts a new item into the queue by adding a Node (having a value) to the end of the LinkedQueue
	public void Enqueue(int value)
	{
		// Allocate a QueueNode for the item
		Node  newNode = new Node  (value);

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
	public int Dequeue()
	{
	  if (isEmpty())
		  throw new RuntimeException();

	  Node  removedNode = Front;   // Keep a ptr to the front node
	  // int removedValue = Front.getData();
	  Front = Front.getNextNode();    		  // Remove the front node

	  Size--;
	  
	  if (Front == null)	// if (Size==0) // if(isEmpty()) 
		  Back = null;		// makeEmpty();

	  return removedNode.getData();
	  // return removedValue;
	}

public static LinkedQueue Merge(ArrayStack s1,ArrayStack s2){
  LinkedQueue newQueue =new LinkedQueue();
  LinkedQueue tempQueue=new LinkedQueue();

while (!s2.isEmpty())
    tempQueue.Enqueue(s2.Pop());
while(!s1.isEmpty())
    tempQueue.Enqueue(s1.Pop());
while (!tempQueue.isEmpty())
  newQueue.Enqueue(tempQueue.Dequeue());
return newQueue;
}



	public void Print()
	{
		if(isEmpty())
			System.out.println("The Queue is empty");
		else
		{
			Node currentNode = Front;
			
			while (currentNode!=null)
			{
				System.out.print(currentNode.getData() + " --> ");
				currentNode = currentNode.getNextNode();
			}
			System.out.println("");
		}
	}
       



    }

    

