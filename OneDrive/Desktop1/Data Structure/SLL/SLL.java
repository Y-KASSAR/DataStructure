package sll;

import java.io.*; 
import java.util.LinkedList; 
public class SLL
{
	private SLLNode Head;
	
	public SLL()
	{
		this.Head = null; 	// If Tail doesn't exist
	}
	
	public SLL(int value)
	{
		this.Head = new SLLNode(value);
	}

	public SLL (SLLNode node)
	{
		this.Head = node;
	}
	
  	public boolean isEmpty()
  	{
  		return this.Head == null; // return true if List is empty
  	}
  	
	public void makeEmpty() // Clear()
	{
		this.Head=null;
	}
	
	public int LengthIterative()
	{
		if (isEmpty())
			return 0;
			
		SLLNode currentNode = (SLLNode) this.Head;
		int counter=1;
		while(currentNode.getNextNode()!=null)
		{
			currentNode=currentNode.getNextNode();
			counter++;
		}
		
		return counter;
	}

  	public static int LengthRecursive(SLLNode start) 
  	{
    	if (start == null) 
    		return 0;
    	else 
    		return 1 + LengthRecursive(start.getNextNode());
  	}

  	public SLLNode getHead()
  	{
  		return this.Head;
  	}
  	
  	public SLLNode getTailIterative()
  	{
  		if (this.isEmpty()) 
  			return null;

  		SLLNode currentNode = this.Head;
    	while (currentNode.getNextNode() != null)
    		currentNode = currentNode.getNextNode();
    	
  		return currentNode;
  	}

  	public SLLNode getTailRecursive(SLLNode start)
  	{
    	if (start == null) 
    		return null;

    	if (start.getNextNode() == null) 
    		return start;
    	else 
    		return getTailRecursive(start.getNextNode());
  	}
  	
 	public void insertAtFront(int value)
 	{
              
 		if ( isEmpty() )
 			this.Head=new SLLNode(value); // If Tail doesn't exist
 		else
 			this.Head = new SLLNode(value, this.Head);
  	}
 	
 	public void insertAtBackIterative(int value) 
 	{
    	SLLNode newNode = new SLLNode(value);

    	if (this.isEmpty())
      		this.insertAtFront(value);
    	else
    	{
    		SLLNode currentNode = this.getTailIterative();
    		currentNode.setNextNode(newNode);
       	}
  	} 
 
                
 	public int removeFromFront()  
 	{
    	if (this.isEmpty())
    	{
    		System.out.println("List is empty");
    		throw new RuntimeException();
    	}

    	int removedValue = this.Head.getData(); // retrieve data being removed
    	
	   	this.Head = this.Head.getNextNode(); 
    	
    	return removedValue;
  	}
 	
 	// remove last node from List
  	public int removeFromBack() 
  	{
    	if (this.isEmpty()) 
                throw new RuntimeException();
        
                SLLNode  currentNode=this.Head;
        while (currentNode.getNextNode().getNextNode() != null) 
            
        currentNode = currentNode.getNextNode();
        
        int removedValue = currentNode.getNextNode().getData();
        
        if (this.Head==currentNode.getNextNode())
        this.Head = null;
        else currentNode.setNextNode(null);
        
return removedValue;

  	}
 	
  	public void Print() 
  	{
  		if (this.isEmpty()) 
  			System.out.println("The list is empty.");
  		else
  		{
  			SLLNode currentNode = this.Head;
  			//String s = "";
  			while (currentNode != null) 
  			{
  				//s += currentNode.getData().toString() + " --> ";
  				System.out.print(currentNode.getData() + " --> ");
  				currentNode = currentNode.getNextNode();
  			}

  			//s += "NULL";
  			//System.out.println(s);
  			System.out.println("");
  		}
  	} 	
  	
public static int countEven(SLL lst){
    if(lst.isEmpty())

        return 0;
            int counter=0;
    if(lst.getHead().getData()%2==0)
        counter++;
    lst.removeFromFront();
    return counter+countEven(lst);
}
public  int occurenceof(int x){
    int counter=0;

SLLNode cn=Head;
while(cn!=null){
if(cn.getData()==x)
    counter++;
cn=cn.getNextNode();
    
}
    System.out.println(counter);
return counter;
}
}
