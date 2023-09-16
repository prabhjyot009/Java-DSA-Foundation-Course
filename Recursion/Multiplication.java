public class Multiplication {
    static int multiply(int a, int b){
        if(b==0){
            return 0;
        }
        int ans=multiply(a,b-1);
        return ans+a;
    }
    public static void main(String[] args) {
        System.out.println(multiply(5,3));
    }
}
