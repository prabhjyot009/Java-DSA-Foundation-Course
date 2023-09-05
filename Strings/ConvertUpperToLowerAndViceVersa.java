package Strings;

import java.util.Scanner;

public class ConvertUpperToLowerAndViceVersa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        // toggle:
        // PHysiCs -> phYSIcS
        for (int i = 0; i < str.length(); i++) {
            // P->p
            // check -> alphabet (small or capital)
            boolean flag = true; // capital (ascii value is less)
            char ch = str.charAt(i);
            if (ch == ' ')
                continue;
            int asci = (int) ch;
            if (asci >= 97)
                flag = false; // small letter
            if (flag == true) { // capital
                asci += 32;
                char dh = (char) asci; // a
                str.setCharAt(i, dh);
            } else { // small
                asci -= 32;
                char dh = (char) asci; // A
                str.setCharAt(i, dh);
            }
        }
        System.out.println(str);
    }

    // without using string builder:
    // public static void main(String[] args) {
    //     String str="PhySics";
    //     // toggle:
    //     // PHysiCs -> phYSIcS
    //     for (int i = 0; i < str.length(); i++) {
    //         // P->p
    //         // check -> alphabet (small or capital)
    //         boolean flag = true; // capital (ascii value is less)
    //         char ch = str.charAt(i);
    //         if (ch == ' ')
    //             continue;
    //         int asci = (int) ch;
    //         if (asci >= 97)
    //             flag = false; // small letter
    //         if (flag == true) { // capital
    //             asci += 32;
    //             char dh = (char) asci; // a
    //             str=str.substring(0, i)+dh+str.substring(i+1);
    //         } else { // small
    //             asci -= 32;
    //             char dh = (char) asci; // A
    //             str=str.substring(0, i)+dh+str.substring(i+1);
    //         }
    //     }
    //     System.out.println(str);
    // }
}
