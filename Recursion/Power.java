import java.util.Scanner;

public class Power {
    static void Power(int p, int q) {
        int power = 1;
        int i = 1;
        while (i <= q) {
            power *= p;
            i++;
        }
        System.out.println(power);
    }
    //Recursion:
    static int printPower(int p, int q) {
        if (q == 0) {
            return 1;
        }
        return printPower(p, q - 1) * p;
    }

    // approach two:
    static int PowerApproachTwo(int p, int q) {
        if(q==1){
            return 1;
        }
        if(q%2==0){
            return PowerApproachTwo(p,q/2)*PowerApproachTwo(p,q/2);
        }
        //if q is odd:
        return PowerApproachTwo(p,q/2)*PowerApproachTwo(p,q/2)*p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(printPower(p, q));
        Power(p, q);
        PowerApproachTwo(p, q);
    }
}
