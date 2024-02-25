package StriverDSA;

import java.math.*;

public class DigitsInNum {
    public static void main(String[] args) {
        int num = 1004;
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            count++;
            num /= 10;
        }
        // using log
        int nume = 1004;
        int digits = (int)Math.log10(nume) + 1;
        System.out.println("Digits in number using log: " + digits);
    }
}
