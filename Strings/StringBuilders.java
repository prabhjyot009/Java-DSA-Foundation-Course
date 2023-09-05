package Strings;

public class StringBuilders {
    public static void main(String[] args) {
        //StringBuilders are mutable in java. they are used to improve the performance of string.

        //declaartion:
        StringBuilder str=new StringBuilder("Hello");
        // str.append("HEllo");
        System.out.println(str);

        //basic fucntions:
        //setCharAt(index,character) and append(character):
        str.setCharAt(0, 'M');
        System.out.println(str);

        //insert(index,character) and deleteCharAt(index,ch):
        str.insert(2, 'y');
        System.out.println(str);
        str.deleteCharAt(2);
        System.out.println(str);

        //reverse() and delete(i,j):
        str.reverse();
        System.out.println(str);
        str.reverse();
        str.delete(2, 4);
        System.out.println(str);

        // String str=""; //it will create a new string everytime we add something to it.
        // for (int i = 0; i < 26; i++) {
        //     char ch=(char)('a'+i);
        //     str=str+ch;
        // }
        // System.out.println(str);

        // //correct sol:
        // StringBuilder sb=new StringBuilder(); //it will create a stringbuilder object.
        // for (int i = 0; i < 26; i++) {
        //     char ch=(char)('a'+i);
        //     sb.append(ch); //it will append the character to the stringbuilder object.
        // }
        // System.out.println(sb);


    }
}
