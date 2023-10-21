package GeekForGeeks;

public class SumOfDivisors {
    public static void main(String[] args) {
        int n = 6;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (n/i)*i;
        }
        System.out.println(sum);
    }
}
