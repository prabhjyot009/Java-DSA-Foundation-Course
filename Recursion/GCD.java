import java.util.Scanner;

public class GCD {
    //brute force:

    /*static void printGCD(int x,int y){
    int i=1;
    int gcd=1;
    while(i<=x && i<=y){
    if (x%i==0 && y%i==0) {
    gcd=i;
    }
    i++;
    }
    System.out.println(gcd);
    }*/

    //using Long division method:

    /*static void printGCD(int x,int y){
    int rem=0;
    while(x%y!=0){
    rem=x%y;
    x=y;
    y=rem;
    }
    System.out.println(y);
    }*/

    //using Euclid's algorithm:

    static int printGCD(int x, int y) {
        if(y==0){
            return x;
        }
        return printGCD(y, x%y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(printGCD(x, y));
    }
}
