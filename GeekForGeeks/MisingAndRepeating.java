package GeekForGeeks;

public class MisingAndRepeating {
    static void printArray(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void findTwoElement(int[] arr,int n){
        int repeating=0;
        int missing=0;
        for (int i = 0; i < n; i++) {
            int idx=Math.abs(arr[i])-1;
            if(arr[idx]<0){
                repeating=idx+1;
            }else{
                arr[idx]=-arr[idx];
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]>0){
                missing=i+1;
                break;
            }
        }
        System.out.println("Repeating element is:"+repeating);
        System.out.println("Missing element is:"+missing);
    }
    public static void main(String[] args) {
        int[] arr={2,2};
        int n=arr.length;
        System.out.println("Orignal array:");
        printArray(arr,n);
        findTwoElement(arr,n);
    }
}
