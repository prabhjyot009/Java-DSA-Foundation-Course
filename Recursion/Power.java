import java.util.Scanner;

public class Power {
    static int printPower(int p,int q){
        if(q==0){
            return 1;
        }
        return printPower(p,q-1)*p;
    }
    static void Power(int p,int q){
        int power=1;
        int i=1;
        while(i<=q){
            power*=p;
            i++;
        }
        System.out.println(power);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
        System.out.println(printPower(p,q));
        Power(p, q);
    }
}
