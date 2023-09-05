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
        // String str="Hello";
        // int idx=str.indexOf('e');
        // System.out.println(idx);
        // String gtr="Kello";
        // System.out.println(str.compareTo(gtr));

        //contains() and startsWith() and endswith():
        // String str="Hello";
        // System.out.println(str.contains("el"));
        // System.out.println(str.startsWith("H"));
        // System.out.println(str.endsWith("lo"));

        //toLowerCase() and toUpperCase()  and concat()
        // String str="Hello";
        // System.out.println(str.toLowerCase());
        // System.out.println(str.toUpperCase());
        // // in case of concat we cannot direct apply function like eg:
        // String s1="abc";
        // String s2="def";
        // s1.concat(s2);
        // System.out.println(s1); //it will give only s1 not s1+s2 because strings are immutable in java.
        // //correct sol:
        // String s3=s1.concat(s2);
        // System.out.println(s3);
        // //or:
        // System.out.println(s1.concat(s2));
        
        //new concept:
        String str="abc";
        str=str+"def"+10+'r'; //'r' character will convert to string and then integer 10 will convert to string
        System.out.println(str);

        //second concept:
        System.out.println("abc"+10+20);
        System.out.println("abc"+(10+20));
        System.out.println(10+20+"abc");

        //Interning Concept: This concept is used to store strings in string pool. and it is used to save memory.
        String s1="Hello";
        String s2="Hello";
        System.out.println(s1==s2); //it will give true because both strings are same and it will store in string pool.
        String s3=new String("Hello");
        String s4=new String("Hello");
        System.out.println(s3==s4); //it will give false because both strings are different and it will not store in string pool.
        System.out.println(s1==s3); //it will give false because both strings are different and it will not store in string pool.
        System.out.println(s1.equals(s3)); //it will give true because both strings are same and it will not store in string pool.
        System.out.println(s1.equals(s2)); //it will give true because both strings are same and it will not store in string pool.
        System.out.println(s3.equals(s4)); //it will give true because both strings are same and it will not store in string pool.

    }    
}