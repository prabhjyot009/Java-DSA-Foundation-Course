package StriverDSA;

public class passbyrefandval {
    public static void dosomething(int num) {
        System.out.println(num);
        num+=5;
        System.out.println(num);
        num+=5;
        System.out.println(num);
        num+=5;
    }

    public static void main(String[] args) {
        int num = 10;
        dosomething(num);
    }
}
