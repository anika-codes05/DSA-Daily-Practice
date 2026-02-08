import java.util.Collections;
import java.util.Arrays;
public class day6_sorting {
    public static void main(String args[]){
        int unsorted[]={5,4,1,3,2};
        bubbleSort(unsorted);
        int arr[]={5,4,1,3,2};
        selectionSort(arr);
        // to use collection class to make a array in descending order:
        Integer arr2[]={5,4,1,6,3,2};
        Arrays.sort(arr2,Collections.reverseOrder());
        System.out.println("this is descending order using collection class"); 
        // to use array class to print the array
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }   
        // for ascending order
        Arrays.sort(arr2);
        System.out.println();
        System.out.println("this is ascending order using collection class");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        } 
        int arr3[] = {5,4,1,2,3};
        insertionSort(arr3);
        int arr4[]= {1,4,1,3,2,4,3,7};
        countingSort(arr4);


    }
    public static void bubbleSort(int unsorted[]){
        System.out.println("this is a bubble sort program : ");
        //outer loop for turns from 0 to n-2
        for(int turn=0;turn<unsorted.length-1;turn++){
            //inner loop to swap and skip the last irtation
        for(int j=0;j<unsorted.length-1-turn;j++){
            if(unsorted[j]>unsorted[j+1]){
            int temp=unsorted[j];
            unsorted[j]=unsorted[j+1];
            unsorted[j+1]=temp;

            }
            
           
        }
            
        }
        for(int i=0;i<unsorted.length;i++){
            System.out.print(unsorted[i]+" ");
        }System.out.println();
        

    }
    public static void selectionSort(int arr[]){
        System.out.println("this is selection sort");
        
        //outer loop
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            //inner loop
            for(int j=i+1;j < arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }

            }
            //swap
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
            
        }
        //to print
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        } System.out.println();
    }
    //insertion sort
    public static void insertionSort(int arr3[]){
        System.out.println("this is insertion sort:");
        for(int i=1;i<arr3.length;i++){
            int curr = arr3[i];
            int prev =  i-1;
            while( prev>=0 && arr3[prev]>curr){
                arr3[prev +1] =arr3[prev +1];
                prev--; 
            }
            arr3[prev+1]=curr;
        }
         //to print
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }System.out.println();

    }
    //counting sort
    public static void countingSort(int arr4[]){
        System.out.println("this is counting sort: ");
        int largest= Integer.MIN_VALUE;
        for(int i=0;i <arr4.length;i++){
            largest =Math.max(largest,arr4[i]);

        }

        int count[]=new int[largest + 1];//because we are starting  a  zero index
        for(int i=0;i<arr4.length;i++){
            count[arr4[i]]++;
        }
            //sorting
            int j=0;
            for(int i=0;i < count.length;i++){
          while(count[i ] > 0){
            arr4[j] =i;
            j++;
            count[i]--;
          }
            } 
             //to print
        for(int i=0;i<arr4.length;i++){
            System.out.print(arr4[i]+" ");
        }     
        
    }
}
