import java.util.Scanner;

public class Multiples {
    static void printMultiples(int num,int k){
        if(k==0){
            return;
        }
        printMultiples(num,( k-1));
        System.out.println(num * k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        printMultiples(num, k);
    }
}
