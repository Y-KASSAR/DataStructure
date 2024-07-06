/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;
import java.util.Stack;
import static stack.LinkedStack.Merge;
import static stack.LinkedStack.MultipleOften;


public class test {

    public static void main(String[] args) {

ArrayStack s1=new  ArrayStack(4);
ArrayStack s2=new ArrayStack(4);
LinkedStack b=new LinkedStack();

s1.Push(1);
s1.Push(2);
s1.Push(3);
s1.Push(4);

s2.Push(5);
s2.Push(6);
s2.Push(7);
s2.Push(8);

b.Push(55);
b.Push(100);
b.Push(150);
b.Push(200);
b.Push(250);
b.Push(300);
b.Print();
MultipleOften(b);

        

LinkedStack k=Merge(s1,s2);
k.Print();




    

   
    }  
    
    

}
