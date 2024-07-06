package stack;

import static java.lang.Math.E;
import static java.lang.StrictMath.E;
import java.util.Stack;
import static javafx.scene.input.KeyCode.E;

public class LinkedStack
{
	private Node Top;
	private int Size;
	
  	public LinkedStack()
  	{
		this.Top = null;
		this.Size = 0;
		// or just call makeEmpty();
  	}

  


  	public boolean isEmpty()
  	{
  		return this.Top==null;
  		// return Size==0;
  	}

  	public void makeEmpty()
  	{
  		if(!isEmpty())
		{
  			this.Top = null;
  			this.Size = 0;
		}
  	}

  	public int Length()
  	{
  		return Size;
  	}
  	
  	public void Push(int value)
  	{
  		if ( isEmpty() )
 			this.Top=new Node(value);
 		else
 			this.Top = new Node(value, this.Top);
  		
  		this.Size++;
  	}
  	
  

     
    
  
 	public int Pop()  
 	{
    	if (this.isEmpty())
    		throw new RuntimeException();

    	int removedValue = this.Top.getData();
	   	this.Top = this.Top.getNextNode(); 
    	
	   	this.Size--;
    	return removedValue;
  	}
 	
 	public int Peek()
 	{
 		if (isEmpty())
 			throw new RuntimeException();
 			
 		return this.Top.getData();
 	}


public static LinkedStack Merge(ArrayStack s1,ArrayStack s2){
    
    LinkedStack newStack=new LinkedStack();
    LinkedStack tempStack=new LinkedStack();
    
    while(!s2.isEmpty())
        tempStack.Push(s2.Pop());
    
    while (!s1.isEmpty())
        tempStack.Push(s1.Pop());
     
      while (!tempStack.isEmpty()) 
   newStack.Push(tempStack.Pop());
      
   return newStack;  
}

public  static void MultipleOften(LinkedStack s1){
    if(s1.isEmpty())
        return;
    if(s1.Peek()%10==0)
    System.out.println("Value="+s1.Peek());
    s1.Pop();
    MultipleOften(s1);
}

 	public void Print()
 	{
  		if (this.isEmpty()) 
  			System.out.println("The Stack is empty.");
  		else
  		{
  			Node currentNode = this.Top;

  			while (currentNode != null) 
  			{
  				System.out.print(currentNode.getData() + " --> ");
  				currentNode = currentNode.getNextNode();
  			}
  			System.out.println("");
  		}
 	}
        
        
}