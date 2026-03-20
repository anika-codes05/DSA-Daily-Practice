import java.util.*;

public class day9_string {
    public static void stringFunction(String str2){
 for(int i=0;i<str2.length();i++){
 System.out.print(str2.charAt(i)+" ");
 
 }
 
    }
    public static boolean palindrome(String str3){
        System.out.println("this is a plaindrome string function:");
        for(int i=0;i<str3.length()/2;i++){
            if(str3.charAt(i) != str3.charAt(str3.length()-i-1)){
           return false;
            }
        }return true;
    }
    public static float shortestdirection(String path){
    int x=0,y=0;
    for(int i=0;i<path.length();i++){
        char dir = path.charAt(i);
        //south
        if(dir =='S'){
         y=y-1;
         
        } else if(dir == 'W'){//west
           x=x-1;

        }else if(dir == 'N'){//north
               y=y+1;
        }else{   //east
          x=x+1;
        }
    }
    System.out.println("value of x,y:"+x+","+y);
     int x2=x*x;
     int y2= y*y;
    return (float)Math.sqrt(x2+y2);
    }
    public static void main(String args[]){
    //    char arr[]={'a','b','c','d'};
    //    String str="abcd";
    //    String str1=new String("xyz"); 
    //    //String are IMMUTABLE
    //    Scanner sc=new Scanner(System.in);
    //    System.out.println("just one word of any length will be entered:");
    //    String name1=sc.next();
    //    System.out.println(name1);
      
    //    System.out.println("complete sentence can be entered");
    //    sc.nextLine();
      
    //    String name2=sc.nextLine();
    //    System.out.println(name2);
    //    System.out.println("the concatination of string: "+ str.concat(str1));
    //    String str2="anika tyagi ";
    //    stringFunction(str2);


     String str3="noon";
     System.out.println(palindrome(str3));
     String path ="WNEENESENNN";
     System.out.println(shortestdirection(path));

       //sc.close();
    }
}
