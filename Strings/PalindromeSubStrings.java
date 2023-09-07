package Strings;

public class PalindromeSubStrings {
    public static void main(String[] args) {
        String str = "abc";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) { 
                String s = str.substring(i, j);
                if (isPalindrome(s)) {
                    count++;
                    System.out.println(s);
                }
            }
        }
        System.out.println("Total Palindrome Substrings are: " + count);
    }

    static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}