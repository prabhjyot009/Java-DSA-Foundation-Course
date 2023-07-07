package Loops;
//print all the values between 1 to 50 except for the multiple of 3:
public class ContinueKeyword {
    public static void main(String[] args) {
        int num=50;
        myloop: for(int i=1;i<=num;i++){
            if(i%3==0){
                continue myloop;
            }
            System.out.println(i);
        }
    }
}
