
package sortingarray;

import java.util.Arrays;

public class sortingarrselection {
    
    public static void selectionSort(int array[]) {
int size=array.length;
int i,j;
for(i=0;i<size;i++){
    System.out.println("Iteration="+(i+1));
    int min_idx=i;
    
    for(j=i+1;j<size;j++){
        System.out.println("\n"+array[i]+"Compared with"+array[j]);
        //find the minimum element in each loop
        if(array[j]<array[min_idx]){
            min_idx=j;
        }
    }
    System.out.println("\n minimum in this iteration="+array[min_idx]);
    int temp=array[i];
    array[i]=array[min_idx];
    array[min_idx]=temp;
    System.out.println("\n Swap"+array[i]+"------>"+array[min_idx]);
    
    for(int k=0;k<array.length;k++)
        System.out.println(array[k]+"\t");   
}
        
    }
public static void main(String args[]){
  int []data={7,4,5,9,8,2,1};
  selectionSort(data);
        
    }
    
}
