package GeekForGeeks;

public class KthSmallest {
    public static int KthSmallestElement(int[] arr){
        int start=0;
        int end=arr.length-1;   
        int k=3;
        while(start<=end){
            int pivot=partition(arr,start,end);
            if(pivot==k-1){
                return arr[pivot];
            }
            else if(pivot>k-1){
                end=pivot-1;
            }
            else{
                start=pivot+1;
            }
        }
        return -1;
    }

    public static int partition(int[] arr,int start,int end){
        int pivot=arr[end];
        int i=start-1;
        for(int j=start;j<end;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[end];
        arr[end]=temp;
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr={7,10,4,3,20,15};
        System.out.println(KthSmallestElement(arr));
    }
}
