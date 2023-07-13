package Arrays;

public class CloningArray {

    static void print_Array(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void changing_array(int[] arr_2){
        for(int i=0;i<arr_2.length;i++){
            System.out.print(arr_2[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[5];
        arr[0]=5;
        arr[1]=6;
        arr[2]=7;
        arr[3]=8;
        arr[4]=9;

        // int[] arr_2=arr;
        //new clone method:
        int[] arr_2=arr.clone();

        System.out.print("Orignal array:");
        print_Array(arr);


        System.out.print("Cloned array:");        
        print_Array(arr_2);;

        //changing some values of arr_2:
        arr_2[0]=0;
        arr_2[1]=0;

        System.out.println("OG array after changes:");
        print_Array(arr);
        System.out.println("Copied array two after changing array 2:");
        print_Array(arr_2);
    }
}
