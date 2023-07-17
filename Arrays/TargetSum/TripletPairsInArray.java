package Arrays.TargetSum;

public class TripletPairsInArray {
    static void printSum(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void threeTargetSum(int[] arr,int x){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[i]+arr[j]+arr[k]==x){
                    System.out.println("target:"+arr[i]+" "+arr[j]+" "+arr[k]);
                    }   
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={4,6,3,5,8,2};
        printSum(arr);
        threeTargetSum(arr, 12);
    }
}
