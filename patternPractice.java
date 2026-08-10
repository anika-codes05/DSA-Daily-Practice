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
    //day-2 pattern 
    public static void pattern4(int n){
        System.out.println("pattern 4");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }System.out.println();
        }
    }
    //patern5
    public static void pattern5(int n){
    System.out.println("pattern 5: ");
     for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }System.out.println();
        }
    }
    //pattern 6
    public static void pattern6(int n){
        System.out.println("pattern 6:");
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }System.out.println();
        }

    }
    
    public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the value of n: ");
         int n=sc.nextInt();
         pattern1(n);
         pattern2(n);
         pattern3(n);
         pattern4(n);
         pattern5(n);
         pattern6(n);

    }
}