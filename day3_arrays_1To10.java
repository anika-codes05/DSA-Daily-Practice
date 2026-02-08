import java.util.*;
public class day3_arrays_1To10 {
    public static void main(String[] args) {
       //initilize array and declare
       int a[]=new int[7];
    //    int number[]={1,3,5};
    //    String name[]={"aman","anika","shahib"};
       Scanner sc=new Scanner(System.in);
       System.out.println("enter 4 numbers: ");
       a[0]=sc.nextInt();
       a[1]=sc.nextInt();
       a[2]=sc.nextInt();
       a[3]=sc.nextInt();
       System.out.println("elements of array a:"+a[0] + " ,"+a[1]);
       // update value of a[1]
       a[1]=a[1]+20;
       System.out.println("the is updated value of array1: " +a[1]);
       int arr[]={4,6,8,10,16,18};
       int key=16;
     int index=  linearSearch(arr,key);
       if(index ==-1){
       System.out.println("NOT found");
       }else{
        System.out.println("the element is found at index number: "+ index);
       }
       //making array for largest element in the array method
       int myarray[]={23,15,3,76,12};
      int large= largestNumberInArray(myarray);
        System.out.println("the largest number of the array is: "+ large);
        int arr2[]={2,4,6,8,10,12,14};
        int key2=1;
       System.out.println("the found element:"+binarySearch(arr2,key2));
       int arr3[]={2,4,6,8,10};
       reverseArray(arr3);
       for(int i=0;i<arr3.length;i++){
        System.out.print(arr3[i]+",");
       }System.out.println();

       //leetcode problem 
       int nums[]={1,2,3};
       int result[]=concatenationArray(nums);
       for(int i=0;i<result.length;i++){
        System.out.println(Arrays.toString(result));
        //we used this Arrays.toString(result) to print values of the array 
       }
       
 
sc.close();
}





public static int linearSearch(int arr[],int key){
    
    System.out.println("this is a program of linear search: ");
    
    for(int i=0;i<arr.length;i++){
        if(arr[i]==key){
           return i;
        }
         
    } return -1;

}
public static int largestNumberInArray(int myarray[]){
    int largest=Integer.MIN_VALUE;
      int smallest=Integer.MAX_VALUE;
    System.out.println("this is a method to find the largest value in the array : ");
    //largest is assigned the -infinity value
    for(int i=0;i<myarray.length;i++){
        if(largest<myarray[i]){
            largest=myarray[i];
            
        }
        if(smallest>myarray[i]){
            smallest=myarray[i];
            
        }

       
    }System.out.println("the smallest value is: "+smallest);
    return largest;
    

}
public static int binarySearch(int arr2[],int key2){
    System.out.println("this is a binary search method and array must be sorted then only you can search");
    int start=0;
    int end=(arr2.length)-1;
    while(start<=end){
        int mid=(start+end)/2;
        if(arr2[mid]==key2){
            return mid;
        }
         if(arr2[mid]>key2){
            end=mid-1;//first half

        }else if(arr2[mid]<key2){
            start=mid+1;//second half
        }
    
    }return -1;
}
public static void reverseArray(int arr3[]){
    int first=0;int last=arr3.length-1;
    while(first<last){
        int temp=0;
        temp=arr3[first];
        arr3[first]=arr3[last];
        arr3[last]=temp;
        first=first+1;//or first++
        last=last-1;// or last--
    }
}

//LEETCODE PROBLEM: SUBMISSION DONE
public static int[] concatenationArray(int nums[]){

int n=nums.length;
int ans[]=new int[2*n];
for(int i=0;i<n;i++){
    ans[i]=nums[i];
    ans[i+n]=nums[i];
} return ans;
}
}
