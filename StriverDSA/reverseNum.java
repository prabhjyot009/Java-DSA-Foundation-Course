package StriverDSA;

public class reverseNum {
    public static void main(String[] args) {
        int num = 102400;
        int rev = 0;
        while (num > 0) {
            rev = (rev * 10) + (num % 10);
            num = num / 10;
        }
        System.out.println(rev);
    }
}
