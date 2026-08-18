import java.util.*;
public class bubblesort{
    public static void bubbleSort1(int array[]){
        int count=0;
        count++;
         for(int i = 0; i < array.length - 1; i++) {
            count++;
            count++;
         for(int j = 0; j < array.length - 1 - i; j++) {
            count++;
            count++;
            if (array[j] > array[j + 1]) {
                count++;
               int temp = array[j];
              count++;
               array[j] = array[j + 1];
             count++;
               array[j + 1] = temp;
               count++;
            }
           
         }count++;
      }count++;
       for(int i = 0; i < array.length; i++) {
         System.out.print(array[i] + " ");
      }

      System.out.println();
      System.out.println("Number of instructions: " + count);
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        
        System.out.println("enter the size of array:");
        int n= sc.nextInt();
        int array[]=new int[n];
        System.out.println("enter the elements of array:");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();

        }
        bubbleSort1(array);
        

     
   }


    
}