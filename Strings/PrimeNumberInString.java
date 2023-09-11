package Strings;

public class PrimeNumberInString {
    public static void main(String[] args) {
        String str = "12345Hello";
        // find prime numbers in string
        for (int i = 0; i < str.length(); i++) {
            if (isPrime(str.charAt(i))) {
                System.out.println(str.charAt(i));
            }
        }
    }

    static boolean isPrime(char ch) {
        int n = ch - '0';
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
