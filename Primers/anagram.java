public class anagram {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String sortstr1 = str1.toLowerCase().chars().sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
        String sortstr2 = str2.toLowerCase().chars().sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
        return sortstr1.equals(sortstr2);
    }

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";
        boolean result = areAnagrams(str1, str2);
        if (result) {
            System.out.println("Are Anagram");
        } else {
            System.out.println("Are not Anagram");
        }
    }
}
