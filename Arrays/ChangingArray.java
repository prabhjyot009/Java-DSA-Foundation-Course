package Arrays;

public class ChangingArray {
    static void change_Array(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }
    }
    static void print_Array(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr=new int[3];
        arr[0]=5;
        arr[1]=6;
        arr[2]=7;

        change_Array(arr);
        print_Array(arr);
    }
}
