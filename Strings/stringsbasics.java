package Strings;
import java.util.*;
/**
 * stringsbasics
 */
public class stringsbasics {
    public static void main(String[] args) {
        // String s="Hello World";
        // System.out.println(s);
        
        // //input:
        // Scanner sc=new Scanner(System.in);
        // String str=sc.nextLine();
        // System.out.println(str);

        //important functions: 1. charAt():we put index and it gives us character at that index. 2. length()
        // String str="Hello";
        // int len=str.length();
        // System.out.println(len);
        // char ch=str.charAt(3);
        // System.out.println(ch);

        //BuiltIn String fucntions:

        // indexOf: we put character and it gives us index of that character and compareTo(): it gives 0 if both strings are equal.
        // if string str > gtr then it will check lexicographically and if str < gtr it will give neagative answer.
        String str="Hello";
        int idx=str.indexOf('e');
        System.out.println(idx);
        String gtr="Kello";
        System.out.println(str.compareTo(gtr));
    }    
}