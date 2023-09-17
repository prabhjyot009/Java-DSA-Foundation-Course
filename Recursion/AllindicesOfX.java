public class AllindicesOfX {
    public static int[] allIndices(int[] arr, int idx, int x, int newidx) {
        if (idx == arr.length) {
            return new int[newidx]; 
        }
        if (arr[idx] == x) {
            int[] iarr = allIndices(arr, idx + 1, x, newidx + 1);
            iarr[newidx] = idx;
            return iarr;
        } else {
            int[] iarr = allIndices(arr, idx + 1, x, newidx);
            return iarr;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 8, 8, 8, 8, 8, 8, 8, 8 };
        int[] ans = allIndices(arr, 0, 8, 0);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
