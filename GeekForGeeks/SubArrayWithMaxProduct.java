package GeekForGeeks;

/**
 * SubArrayWithMaxProduct
 */
public class SubArrayWithMaxProduct {

    public static void main(String[] args) {
        int[] arr={6,-3,-10,0,2};
        System.out.println(maxProduct(arr));
    }
    static int maxProduct(int[] arr){
        int max=arr[0];
        int min=arr[0];
        int maxProduct=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(arr[i], max*arr[i]);
            min=Math.min(arr[i], min*arr[i]);
            maxProduct=Math.max(maxProduct, max);
        }
        return maxProduct;
    }

    //different approach
    static int maxProduct2(int[] arr){
        int max=arr[0];
        int min=arr[0];
        int maxProduct=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==0){
                max=1;
                min=1;
                continue;
            }
            int temp=max;
            max=Math.max(arr[i], Math.max(max*arr[i], min*arr[i]));
            min=Math.min(arr[i], Math.min(temp*arr[i], min*arr[i]));
            maxProduct=Math.max(maxProduct, max);
        }
        return maxProduct;
    }
    
}