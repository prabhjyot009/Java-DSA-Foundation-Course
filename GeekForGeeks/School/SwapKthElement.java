package GeekForGeeks.School;

public class SwapKthElement {
    public static void main(String[] args) {
        int Arr[]={1, 2, 3, 4, 5, 6, 7, 8};
        int n=Arr.length;
        int k=3;
        int temp=Arr[k-1];
        Arr[k-1]=Arr[n-k];
        Arr[n-k]=temp;
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i]+" ");
        }
    }
}
