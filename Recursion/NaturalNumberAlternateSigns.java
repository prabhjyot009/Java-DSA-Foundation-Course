import java.util.Scanner;

public class NaturalNumberAlternateSigns {
    static int printNatural(int n){
        if(n==0){
            return 0;
        }
        if(n%2==0){
            return printNatural(n-1)-n;
        }
        return printNatural(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printNatural(n));
    }
}
