import java.util.*;
public class day10_stringfunction {
    public static void stringFunction(String str2){
}
public static void main(String args[]){
    String str1="Tony";
    String str2="Tony";
    String str3= new String("Tony");
    System.out.println("use of '==' for equal check");
    if(str1 == str2){
        System.out.println("strings are equal");
    }else{
        System.out.println("string are not equal");
    }
    if(str1 == str3){
        System.out.println("strings are equal");
    }else{
        System.out.println("string are not equal");
    }
    if(str1.equals(str2)){
        System.out.println(" for string str1, str2 : strings are equal");
    }else{
        System.out.println("for string str1, str2 : string are not equal");
    }
    System.out.println("this is equals function  which only check the value:");
     if(str1.equals(str3)){
        System.out.println(" for string str1, str3 : strings are equal");
    }else{
        System.out.println("for string str1, str3 : string are not equal");
    }
}
}
