package Arrays.CsharpQuestions;

import java.util.Scanner;

public class CountVovelsConsonantsSpace {
    public static void main(String[] args) {
        String str = "Take u forward is Awesome";
        int vovels = 0;
        int consonants = 0;
        int spaces = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            ch = Character.toLowerCase(ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vovels++;
            }
            else if(ch == ' ') {
                spaces++;
            }
            else{
                consonants++;}
        }
        System.out.println(vovels);
        System.out.println(consonants);
        System.out.println(spaces);
    }

}