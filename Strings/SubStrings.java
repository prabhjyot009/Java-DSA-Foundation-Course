package Strings;

public class SubStrings {
    public static void main(String[] args) {
        // String str="abcd";

        //Substrings are continuous part of a string.
        //str substrings can be:
        // a, ab, abc, abcd
        // b, bc, bcd       //ba cannot be a substring
        // c, cd
        // d

        //in this str.SubString(0,3) fucntion will run from 0th index to 3rd index(3 -1) means 2nd index.
        // System.out.println(str.substring(0, 3));
        // System.out.println(str.substring(1));
        // System.out.println(str.substring(1, 3));

        // String s="Physics";
        // for (int i = 2; i < 4; i++) {
        //     System.out.print(s.substring(i));
        // }
        String s="abcd"; //0-3  
        for (int i = 0; i < 4; i++) {
            for (int j = i+1; j < 5; j++) {
                System.out.print(s.substring(i,j)+" ");
            }
        }
        
    }
}
