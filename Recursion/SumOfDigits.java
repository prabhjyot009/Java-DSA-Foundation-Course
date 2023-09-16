import java.util.Scanner;

public class SumOfDigits {
    static int printSumofdigits(int n){
        if(n>=0 && n<=9){
            return n;
        }
        return printSumofdigits(n/10)+(n%10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(printSumofdigits(n));
    }
}
