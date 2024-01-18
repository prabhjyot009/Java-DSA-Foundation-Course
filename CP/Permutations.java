package CP;

// public class Permutations {
//     public static int fact(String str){
//         int length=str.length();
//         int count=1;
//         for (int i = 1; i <=length; i++) {
//             count=count*i;
//         }
//         return count;
//     }
//     public static 
//     public static void main(String[] args) {
//         String str="abc";
//         System.out.println(fact(str));
//     }
// }

//using hashset

import java.util.*;
public class Permutations
{
    public static void main(String[] args) {
        String str="eye";
        HashSet<String> hs=new HashSet<>();
        permutations(str,hs,"");
        System.out.println(hs.size());
    }
    public static void permutations(String str,HashSet<String> hs,String ans){
        if(str.length()==0){
            hs.add(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String ros=str.substring(0,i)+str.substring(i+1);
            permutations(ros,hs,ans+ch);
        }
    }
}

