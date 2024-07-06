
package stack;



/**
 * Author: 			Khaled zein
 * LastModified:	19/04/2016
 * 
 * Attributes:
 *  - Anytype	theArray
 *  - int		Top
 *  - int		Size
 *  
 * Operations:
 *  + 			ArrayStack				( )							Time Complexity: O(1)
 *  + 			ArrayStack				( int maxSize )				Time Complexity: O(1)
 *  + boolean 	isEmpty    				( )							Time Complexity: O(1)
 *  + boolean 	isFull    				( )							Time Complexity: O(1)
 *  + void 		makeEmpty  				( )							Time Complexity: O(1)
 *  + int 		Length  				( )							Time Complexity: O(1)
 *  + int	 	Peek	  				( )							Time Complexity: O(1)
 *  + void	 	Push	  				( int value )				Time Complexity: O(1)
 *  + int		Pop	  					( )							Time Complexity: O(1)
 *  + void 		Print  					( )							Time Complexity: O(N)
 */

        public class ArrayStack
        {
	private int theArray[];
	private int Top;
	private int Size;
	
	public ArrayStack()
	{
		int maxSize = 10;
		this.theArray = new int[ maxSize ];
		this.Top = -1;
		this.Size = 0;
	}
	
	public ArrayStack(int maxSize)
	{
		this.theArray = new int[ maxSize ];
		this.Top = -1;
		this.Size = 0;
	}
	
	public boolean isEmpty() 
	{
		return this.Top==-1;
  	}
	
  	public boolean isFull() 
  	{
  		return this.Size == this.theArray.length;
  	}
  	
  	public void makeEmpty() 
  	{
		if (!this.isEmpty()) 
		{
      		this.Top = -1;
      		this.Size = 0;
    	}
  	}
  	
  	public int Length() 
  	{
  		return Top +1;
  	} 

	public int Peek()
	{
    	if (this.isEmpty()) 
    		throw new RuntimeException();
		
		return theArray[Top];
	}

	public void Push(int value)
	{
		if(isFull())
			throw new RuntimeException();
	Top++;	
      	this.theArray[Top] = value;
      	this.Size++;
	}
	
      

  	public int Pop() 
  	{
    	if (this.isEmpty()) 
    		throw new RuntimeException();

    	this.Size--;
    	return theArray[Top--];
  	}
        
  	
        
  	public void Print()
  	{
  		if (isEmpty())
  			System.out.println("Stack is empty");
  		else
  			for(int i=Size-1; i>=0; i--)
  				System.out.print(theArray[i] + " --> ");
  		
  		System.out.println("");
  	}
        



        
        

  
    }
