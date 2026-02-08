import java.util.Scanner;
public class day8_array2D {
    public static void main(String args[]){
        System.out.println("let's print a 2Darray:");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of m and n :");
        int m= sc.nextInt();
        int n=sc.nextInt();
        int arr[][]= new int [m][n];
        System.out.println("enter the values in array now: ");
        //taking input from user
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //to print the input matrix
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] +" ");
            }System.out.println();
        }
        maxElementminElement(arr);
        sc.close();

    }
    //a method to find the largest value of the matrix
    public static void maxElementminElement(int arr[][]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] > max ){
                    max= arr[i][j];
                }
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }System.out.println("min:"+min+" and max:"+ max);

    }
    
    
}
