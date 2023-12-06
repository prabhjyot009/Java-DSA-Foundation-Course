package GeekForGeeks.School;

public class reverseDigits {
    public static void main(String[] args) {
        long rev=0;
        long n=200;
        while(n>0){
            rev=(rev*10)+n%10;
            n/=10;
        }
        System.out.println(rev);
    }
}
