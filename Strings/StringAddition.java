package Strings;

public class StringAddition {
    public static void main(String[] args) {
        //1xyz23=24

        String s = "1xyz23";
        int sum = 24;
        int i = 0;
        int j = 0;
        int temp = 0;
        int num = 0;
        int count = 0;
        while (i < s.length()) {
            if (j < s.length()) {
                if (Character.isDigit(s.charAt(j))) {
                    num = num * 10 + Character.getNumericValue(s.charAt(j));
                    j++;
                } else {
                    temp = temp + num;
                    num = 0;
                    j++;
                }
            } else {
                temp = temp + num;
                num = 0;
                if (temp == sum) {
                    count++;
                }
                temp = 0;
                i++;
                j = i;
            }
        }
        System.out.println(sum);
    }
}
