package GeekForGeeks;

public class HowManyX {
    public static void main(String[] args) {
        int[] arr={10,11, 12, 13, 14, 15, 16, 17, 18, 19};
        int L=arr[0];
        int R=arr[arr.length-1];
        int X=1;
        int count=0;
        for(int i=L+1;i<R;i++){
            int temp=i;
            while(temp>0){
                int digit=temp%10;
                if(digit==X){
                    count+=1;
                }
                temp/=10;
            }
        }
        System.out.println(count);
    }
}
