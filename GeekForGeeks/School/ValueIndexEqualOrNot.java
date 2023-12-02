package GeekForGeeks.School;

public class ValueIndexEqualOrNot {
    public static void main(String[] args) {
        int[] arr={15, 2, 45, 12, 7};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==i+1){
                System.out.println(i+1);
            }
        }

    }
}
