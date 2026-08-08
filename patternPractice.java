import java.util.*;
public class patternPractice{

    public static void pattern1(int n){
    //square star pattern
    System.out.println("pattern 1");
     for(int i=1;i<n;i++){
      for(int j=1;j<n;j++){
        System.out.print("*");
        }System.out.println();
      }
    }
    //pattern 2 triangle
    public static void pattern2(int n){
        System.out.println("pattern 2");
        for(int i=1;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("*");
            } 
            System.out.println();
        }
    }

    public static void pattern3(int n){
        System.out.println("pattern 3: ");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            } 
            System.out.println();
        }
    }
    public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         pattern1(n);
         pattern2(n);
         pattern3(n);

    }
}