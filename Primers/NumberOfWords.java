import java.util.Scanner;

public class NumberOfWords {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.nextLine();
        String strr=str.toLowerCase();
        for (int i = 0; i < strr.length(); i++) {
            if(strr.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
