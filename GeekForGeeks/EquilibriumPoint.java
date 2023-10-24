package GeekForGeeks;

/**
 * EquilibriumPoint
 */
public class EquilibriumPoint {

    public static void main(String[] args) {
        int[] arr={1,3,5,2,2};
        System.out.println(equilibriumPoint(arr));
    }
    static int equilibriumPoint(int[] arr){
        int n=arr.length;
        int sum=0;
        int leftsum=0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        for (int i = 0; i < n; i++) {
            sum-=arr[i];
            if (leftsum==sum) {
                return i+1;
            }
            leftsum+=arr[i];
        }
        return -1;
    }

    
}