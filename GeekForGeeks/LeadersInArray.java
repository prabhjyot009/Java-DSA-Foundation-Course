package GeekForGeeks;

public class LeadersInArray {
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void lead(int[] arr){
        int n=arr.length;
        int max=0;
        int[] res=new int[n];
        int m=res.length;
        for (int i = n-1; i >=0; i--) {
            if (arr[i]>max) {
                res[max]=arr[i];
                max=arr[i];
            }
        }
        for (int i = m-1; i >=0; i--) {
            if (res[i]!=0) {
                System.out.print(res[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={16,17,4,3,5,2};
        System.out.println("Orignal Array:");
        printArray(arr);
        System.out.println("Leaders in Array:");
        lead(arr);
    }
}
