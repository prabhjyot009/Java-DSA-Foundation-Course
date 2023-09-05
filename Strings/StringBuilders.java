package Strings;

public class StringBuilders {
    public static void main(String[] args) {
        //StringBuilders are mutable in java. they are used to improve the performance of string.
        String str=""; //it will create a new string everytime we add something to it.
        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
            str=str+ch;
        }
        System.out.println(str);

        //correct sol:
        StringBuilder sb=new StringBuilder(); //it will create a stringbuilder object.
        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
            sb.append(ch); //it will append the character to the stringbuilder object.
        }
        System.out.println(sb);
        

    }
}
