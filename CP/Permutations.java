package CP;

public class Permutations {
    public static void main(String[] args) {
        String str="abc";
        int length=str.length();
        int count=1;
        for (int i = 1; i <=length; i++) {
            count=count*i;
        }
        System.out.println(count);
    }
}
