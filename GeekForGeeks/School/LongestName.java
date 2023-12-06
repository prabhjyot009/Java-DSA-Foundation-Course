package GeekForGeeks.School;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestName {
    public static void main(String[] args) {
        String names[] = { "Geek", "Geeks", "Geeksfor",
        "GeeksforGeek", "GeeksforGeeks" };
        String max="";
        for (int i = 0; i < names.length; i++) {
            if(max.length()<names[i].length()){
                max=names[i];
            }
        }
        System.out.println(max);
    }
}
