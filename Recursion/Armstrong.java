import java.util.Scanner;

public class Armstrong {
    // static void printArmstrong(int x){
    //     int temp=x;
    //     int sum=0;
    //     while (x>0) {
    //         sum+=(x%10)*(x%10)*(x%10);
    //         x=x/10;
    //     }
    //     if(temp==sum){
    //         System.out.println("it is armstrong");
    //     }
    //     else{
    //         System.out.println("it is not armstrong");
    //     }
    // }
        static int printArmstrong(int x){
            if(x>=0 && x<=9){
                return x*x*x;
            }
            int ans=printArmstrong(x/10)+(x%10)*(x%10)*(x%10);
            return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int check=printArmstrong(x);
        if(check==x){
            System.out.println("It is armstrong");
        }
        else{
            System.out.println("It is not armstrong");
        }
    }
}
