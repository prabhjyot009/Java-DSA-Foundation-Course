package Arrays;

public class BasicSwappingArray {
    static void printArray(int[] arr){

    }
    static void swapitem(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(b);
    }
    public static void main(String[] args) {
        swapitem(2,3);
    }
}
