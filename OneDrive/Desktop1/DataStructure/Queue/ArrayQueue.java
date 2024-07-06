 package Lec14.Queue.ArrayQueue.Anytype;

/**
 * Author: 			Khaled Ghosn
 * LastModified:	25/04/2016
 * 
 * Attributes:
 *  - Anytype	theArray
 *  - int		Front
 *  - int		Back
 *  - int		Size
 *  
 * Operations:
 *  + 			ArrayQueue				( )							Time Complexity: O(1)
 *  + 			ArrayQueue				( int maxSize )				Time Complexity: O(1)
 *  + boolean 	isEmpty    				( )							Time Complexity: O(1)
 *  + boolean 	isFull    				( )							Time Complexity: O(1)
 *  + void 		makeEmpty  				( )							Time Complexity: O(1)
 *  + int 		Length  				( )							Time Complexity: O(1)
 *  + Anytype 	getFront  				( )							Time Complexity: O(1)
 *  + void	 	Enqueue	  				( Anytype value )			Time Complexity: O(1)
 *  + Anytype	Dequeue					( )							Time Complexity: O(1)
 *  + void 		Print  					( )							Time Complexity: O(N)
 */

	public class ArrayQueue < Anytype >
{
	private Anytype [ ] theArray;	// ArrayQueue starting at the position 0
	private int Front;				// index of the first element (head) of the ArrayQueue
	private int Back;				// index of the last element (tail) of the ArrayQueue
	private int Size;				// current size of the ArrayQueue

	// create an empty ArrayQueue with a default maxSize
	public ArrayQueue()
	{
		int maxSize = 10;
		theArray =  (Anytype[]) new Object[maxSize];

		// makeEmpty();
		Front =  0;
		Back  = -1;
		Size  =  0;
	}

	// create an empty ArrayQueue with a specific maxSize
	public ArrayQueue(int maxSize)
	{
		// if (maxSize < 10)
		// 	maxSize = 10; 
			
		theArray =  (Anytype[]) new Object[maxSize];
		
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
		// if size doesn't exist
//		if (Front <= Back)
//	  		Size = Back - Front + 1;
//	  	else
//	  		Size = (theArray.length - Front) + (Back + 1);
	  	
		return Size;
	}
		
	// return the value from the top of the non-empty ArrayQueue without removing it
	public Anytype getFront()
	{
		if(isEmpty())
			throw new RuntimeException();

		return theArray[Front];
	}
	
  	// add a value to the end of the non-full ArrayQueue
	public void Enqueue(Anytype value)
	{
		if (this.isFull())
			throw new RuntimeException();
				
		this.Back = increment(Back);
		// if(++Back == theArray.length)
		// Back = 0;		
		
		this.theArray[Back] = value;
		this.Size++;
	}
	
	// remove the value from the head of the non-empty ArrayQueue then
  	// return the removed value if the ArrayQueue is not empty
	public Anytype Dequeue()
	{
		if(isEmpty())
			throw new RuntimeException();
		
		Anytype removedValue = theArray[Front];
		
		if(Size == 1)
			makeEmpty();
		else
			Front = increment(Front);
			// if(++Front == theArray.length)
			//		Front = 0;
		
		Size--;

		// switched by (if size==1)
		// if (this.isEmpty())
		// this.Front = 0; // base of the array
		
		return removedValue;
	}
	
	private int increment(int x)
	{
		if(++x == theArray.length)
			x = 0;
		return x;
	}

  	// display the content of the ArrayQueue on the screen. The array elements will be separated by a space character
  	public void Print() {
    	String s = "\n ";
		
    	if (this.isEmpty()) {
      		System.out.println("\n The queue is empty");
      		return;
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

}