package Arrays.Sorting;

public class lexicographicalOrder {
    //Selection Sort
    public static void main(String[] args) {
        String[] fruits={"kiwi","apple","papaya","mango"};

        int n=fruits.length;
        for (int i = 0; i < n-1; i++) {
            int min_index=i;
            for (int j = i+1; j < n; j++) {
                if(fruits[j].compareTo(fruits[min_index])<0){
                    min_index=j;
                }
            }
            String temp= fruits[i];
            fruits[i]=fruits[min_index];
            fruits[min_index]=temp;
        }
        for (String i : fruits) {
            System.out.print(i+" ");
        }
    }
}
