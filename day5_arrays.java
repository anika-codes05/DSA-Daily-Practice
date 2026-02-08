public class day5_arrays {
    public static void main(String[] args) {
        // int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
       System.out.println( kadanes(arr));
       int arr2[]={4,2,0,6,3,2,5};
       System.out.println(trappingWater(arr2));
        
       
    }
    //kadanes algorithm
    public static int  kadanes(int arr[]){
        int currsum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           currsum=Math.max(arr[i],currsum+ arr[i]);
           max = Math.max(max,currsum);
        }
        return max;
    }
    // trapping rainwater
    public static int trappingWater(int arr2[]){
        //leftmax boundary
        int leftMax[]=new int [arr2.length];
        leftMax[0]=arr2[0];
        for(int i=1;i<arr2.length;i++){
            leftMax[i]=Math.max(arr2[i],leftMax[i-1]);

        }


        //rightmax boundary

        //you can assume arr2.length =n also
        int rightMax[]=new int [arr2.length];
        rightMax[arr2.length-1]=arr2[arr2.length-1];
        for(int i=arr2.length-2;i>=0;i--){
            rightMax[i]=Math.max(arr2[i],rightMax[i+1]);

        }
        int trappedrainwater=0;
        //loop to calculate the water level and trapped water
        for(int i=0;i<arr2.length;i++){
            int waterlevel;
            
            waterlevel=Math.min(leftMax[i],rightMax[i]);
            trappedrainwater +=(waterlevel-arr2[i]);

        }
        return trappedrainwater;


    }
}
