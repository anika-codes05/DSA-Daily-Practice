public class july21Kadanesalgo {
    public static void main(String args[]){
        int array[]={-2,-3,4,-1,-2,1,5,-3};
        int maxSum= Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<array.length;i++){
            currSum += array[i];
            maxSum = Math.max(maxSum,currSum);
          if(currSum < 0){
            currSum = 0;
          }
        }
        System.out.println("the max subarray sum : "+ maxSum);
    }
}
// time complexity: o(n) -> best
// name of algo for max subarray sum = kadane's algorithm
