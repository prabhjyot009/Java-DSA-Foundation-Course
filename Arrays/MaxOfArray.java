package Arrays;
class maxArray{
    void maxx(){
        int[] arr={81,3,6,2,8,1};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print("Maximum is:"+max);
    }
}
public class MaxOfArray {
    public static void main(String[] args) {
        maxArray obj=new maxArray();
        obj.maxx();
    }
}
