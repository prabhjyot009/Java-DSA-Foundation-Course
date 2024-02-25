package StriverDSA;

public class DigitsInNum {
    public static void main(String[] args) {
        int num = 1004;
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            count++;
            num /= 10;
        }
        System.out.println(count);
    }
}
