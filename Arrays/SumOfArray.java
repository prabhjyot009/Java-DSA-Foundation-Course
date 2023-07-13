package Arrays;

class sumArray{
    void summ(){
        int[] arr={1,5,3};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
public class SumOfArray {
    public static void main(String[] args) {
        sumArray obj=new sumArray();
        obj.summ();
    }
}
