package Strings;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String result = "";
        int str1Length = str1.length();
        int str2Length = str2.length();
        for (int i = 0; i < str1Length; i++) {
            if (i < str1Length) {
                if (!str2.contains(String.valueOf(str1.charAt(i)))) {
                    result += str1.charAt(i);
                }
            }
        }
        for (int i = 0; i < str2Length; i++) {
            if (i < str2Length) {
                if (!str1.contains(String.valueOf(str2.charAt(i)))) {
                    result += str2.charAt(i);
                }
            }
        }
        System.out.println(result);
    }

}
