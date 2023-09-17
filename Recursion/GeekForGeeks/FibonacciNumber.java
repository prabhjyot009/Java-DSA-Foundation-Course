package GeekForGeeks;

public class FibonacciNumber {
    //Function to return list containing first n fibonacci numbers the first two terms of the series are 1 and 1.
    public static long[] printFibb(int n) {
        //code here
        long[] arr=new long[n];
        arr[0]=1;
        if(n==1){
            return arr;
        }
        arr[1]=1;
        if(n==2){
            return arr;
        }
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr;
    }
    public static void main(String[] args) {
        int n=7;
        long[] arr=printFibb(n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
