package Loops;
//print the first multiple of 5 which is also a multiple of 7.
public class BreakKeyword {
    public static void main(String[] args) {
        int num=5;
        int i=1;
        int multiple=0;
        while(i<=10){
            multiple=num*i;
            i++;
            if(multiple%7==0){
                System.out.print(multiple);
                break;
            }
        }
    }
}
