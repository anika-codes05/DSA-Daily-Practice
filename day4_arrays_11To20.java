public class day4_arrays_11To20 {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        pairInAnArray(arr);
        int arr1[]={2,4,6,8,10};
        subarrayPrint(arr1);
        int arr2[]={1,-3,2};
        maxSubarraySum( arr2);
        int arr3[]={1,-2,6,-1,3};
        maxSumOfArray(arr3);
        

    }
    public static void pairInAnArray(int arr[]){
        System.out.println("this a method of pair in an array: ");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }System.out.println();
        }
    }
    public static void subarrayPrint(int arr1[])
    {
        int ts=0; 
        System.out.println("this is a program to see the subarray of the array:  ");
        // we will use nested loop concept here and have 3 loops in it 
        for(int i=0;i<arr1.length;i++){
            int start=i;
            for(int j=i;j<arr1.length;j++){
                int end = j;
                int sum=0; int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for(int k=start;k<=end;k++){

                    System.out.print(arr1[k]+" ");
                    //to update the sum
                    sum=sum+arr1[k];
                    if(max<arr1[k])
                        max=arr1[k];
                    if(min>arr1[k])
                        min=arr1[k];
                    

                }
                 System.out.println();
                System.out.println("sum:"+sum+ ", max: "+max+",min: "+min);
               
                

                ts++;
            }
            System.out.println();
        }
        System.out.println("total subarrays: "+ ts);
        // to print the total number of subarrays  formula is n(n+1)/2
    }
    public static void maxSubarraySum(int arr2[]){//Brute Force
        System.out.println("this is a brute force and question to calculae maximum of subarray sum: ");
        int currsum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr2.length;i++){
            int start=i;
            for(int j=i;j<arr2.length;j++){
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++){
                    currsum=currsum+arr2[k];
                    System.out.println("current sum :"+currsum);
                    
                }if(max<currsum){
                        max=currsum;
                    }
            }
        }
        System.out.println("maximum sum:"+ max);
    }
    public static void maxSumOfArray(int arr3[]){
        //this is the program of the prifix approach
        System.out.println("the method is to find the maximum sum of the subarrays by prefix approach: ");
        int currsum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[arr3.length];
        prefix[0]=arr3[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr3[i];
        }

        for(int i=0;i<arr3.length;i++){
            int start=i;
            for(int j=i;j<arr3.length;j++){
                int end=j;
                currsum =start==0?prefix[end] : prefix[end]-prefix[start-1];
                if(maxSum<currsum){
                    maxSum = currsum;
                }
            }
        }System.out.println("max sum="+maxSum);
    }
}
