package queue;

import java.util.Arrays;
import java.util.Queue;

public class ArrayQueue  
{
	private int  [ ] theArray;	                 // ArrayQueue starting at the position 0
	private int Front;				// index of the first element (head) of the ArrayQueue
	private int Back;				// index of the last element (tail) of the ArrayQueue
	private int Size;				// current size of the ArrayQueue

	// create an empty ArrayQueue with a default maxSize
	public ArrayQueue()
	{
		int maxSize = 10;
		theArray =  new int[maxSize];

		// makeEmpty();
		Front =  0;
		Back  = -1;
		Size  =  0;
	}

	// create an empty ArrayQueue with a specific maxSize
	public ArrayQueue(int maxSize)
	{
		
			
		theArray =   new int[maxSize];

		// makeEmpty();
		Front =  0;
		Back  = -1;
		Size  =  0;
	}
	
	// return true if this ArrayQueue is empty and false otherwise
	public boolean isEmpty()
	{
		return Size == 0;
	}
	 
	// return true if this ArrayQueue is full and false otherwise
	public boolean isFull() 
	{
		return this.Size == this.theArray.length;
	} 
	  	
	// make this ArrayQueue empty without modifying its maxSize
	public void makeEmpty()
	{
		if (!this.isEmpty()) 
		{
			Front =  0;
			Back  = -1;
			Size  =  0;
		}
	}

	// return the number of elements (i.e., size) in this ArrayQueue
	public int Length() 
	{

		return this.Size;
	}
		
	// return the value from the top of the non-empty ArrayQueue withoud removing it
	public int  getFront()
	{
		if(isEmpty())
			throw new RuntimeException();

		return theArray[Front];
	}
	
  	// add a value to the end of the non-full ArrayQueue
	public void Enqueue(int  value)
	{
		if (this.isFull())
			throw new RuntimeException();
	
		this.Back = increment(Back);
		this.theArray[Back] = value;
		this.Size++;
		
   
	}
	
	// remove the value from the head of the non-empty ArrayQueue then
  	// return the removed value if the ArrayQueue is not empty
	public int  Dequeue()
	{
		if(isEmpty())
			throw new RuntimeException();
		
		int  removedValue = theArray[Front];
		
		if(Size == 1)
			makeEmpty();
		else
			Front = increment(Front);
		
		
		Size--;
		return removedValue;
	}

   
	
	private int increment(int x)
	{
		if(x++ == theArray.length)
			x = 0;
		return x;
	}
         
   

  	// display the content of the ArrayQueue on the screen. The array elements will be separated by a space character
  	public void Print() {
    	String s = "\n ";
		
    	if (this.isEmpty()) {
      		System.out.println("\n The queue is empty");
      		return ;
    	}    	
        
        if (this.Front <= this.Back)
      		for (int i = this.Front; i <= this.Back; i++)
        		s += this.theArray[i] + " ";
      	else 
      	{
      		for (int i = this.Front; i <= this.theArray.length - 1; i++)
        		s += this.theArray[i] + " ";
      
      		for (int i = 0; i <= this.Back; i++)
        	s += this.theArray[i] + " ";
      	}
      	
      	System.out.println(s);
	} 
        
      public static void main(String[] args) {


      
    
   
   
   
       
    }
            

  	
}
