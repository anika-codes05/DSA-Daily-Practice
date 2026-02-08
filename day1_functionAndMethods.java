public class day1_functionAndMethods {
   public static void main(String args[]){
      Swap(9,20);
      int multiply=Product(5,9);
      System.out.println("product of two number ="+ multiply);
      System.out.println("the factorial of the number is="+ factorial(6));
      System.out.println("the binomial coeffecient is ="+ binomialcoeffecient(5,2));
      System.out.println(isPrime(15));
      PrimeRange(20);

    
   }
   public static void Swap(int a,int b){
      int temp=0;
      temp=a;
      a=b;
      b=temp;
      System.out.println(a);
       System.out.println(b);
      
   }
   public static int Product(int p,int q){
      int product=p*q;
      return product;
   }
   public static int factorial(int n){
      int f=1;
      for(int i=1;i<=n;i++){
         f=f*i;

      }
      return f;
   }
   public static  double binomialcoeffecient(int n,int r){
      int n_fact=factorial(n);
      int r_fact= factorial(r);
      int diff=n-r;
      int diff_fact=factorial(diff);
      double binomialcoff =n_fact/(r_fact*diff_fact);
      return binomialcoff;

   }
   //optimized prime program
   public static boolean isPrime(int n){
      if(n==2){
         return true;
      }
      for(int i=2;i<=Math.sqrt(n);i++){
         if(n%i==0){
            return false;
         }
      }
      return true;

   }
   //function to print the range of the prime number from 2 to n
   public static void PrimeRange(int n){
      for(int i=2;i<=n;i++){
         if(isPrime(i)==true)
         System.out.println(i);
      }
   }
}