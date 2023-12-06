package GeekForGeeks.School;

public class palindrome {
    public static void main(String[] args) {
        int n = 555;
        int temp = n;
        int rev = 0;
        while (n > 0) {
            rev = (rev * 10) + n % 10;
            n /= 10;
        }
        if (rev == temp) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not Palindrome");
        }
    }
}
