package Basics;

public class seriesprint {
    public static void main(String[] args) {
        int sequence=12;
        int a=1;
        for (int i = 0; i < sequence; i++) {
            System.out.print(a+" ");
            a*=2;
        }
    }
}