package Arrays;

public class SwappingArray {
    static void printArray(int[] arr){

    }
    static void swapitem(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(b);
    }
    public static void main(String[] args) {
        int[] arr={1,2};
        swapitem(2,3);
    }
}
