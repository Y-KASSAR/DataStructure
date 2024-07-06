package sortingarray;
import java.util.Scanner;
public class bubbleSort {
    
public static void bubbleSort(int arr[]) {
        
}
    public static void main(String args[]) {
           Scanner  scanner=new Scanner(System.in);
           System.out.println("Enter number of elements");
           int n=scanner.nextInt();
           int arr[]=new int[n];
           System.out.println(" Enter "+n+ "Elements:");
           for(int i=0;i<arr.length;i++){
               System.out.println(arr[i]=scanner.nextInt());
               
               
        }   
    
           for(int i=0;i<arr.length;i++){
               System.out.println("Round="+(i+1));
               for(int j=1;j<arr.length;j++){
                   System.out.println("\nSwap"+arr[j-1]+"------>"+arr[j]);
                   if(arr[j-1]>arr[j]){
                       int temp=arr[j-1];
                       arr[j-1]=arr[j];
                       arr[j]=temp;
                       System.out.println("\n"+arr[j]+"greater than "+arr[j-1]);
                   }
               }
               System.out.println("Array after round"+(i+1)+"is \t");
               for(int k=0;k<arr.length;k++)
                   System.out.println(arr[k]+"\t");
           }
    }

    }
    

