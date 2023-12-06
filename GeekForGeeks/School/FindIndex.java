package GeekForGeeks.School;

public class FindIndex {
    public static void main(String[] args) {
        int[] arr={ 1, 2, 3, 4, 5, 5 };
        int[] a1={-1,-1};
        int key=5;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                count++;
                if(count==1){
                    a1[0]=i;
                    a1[1]=i;
                }
                else if(count>1){
                    a1[1]=i;
                }
            }
        }
        System.out.println(a1);
    }
}