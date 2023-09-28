package Arrays;

public class Movezeroesend {
    public static void main(String[] args) {
        int[] a = { 1, 2, 0, 1, 0, 1 };
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[j] = a[i];
                j++;
            }
        }

        for (int ele : a)
            System.out.print(ele + " ");

        while (j < a.length)
            a[j] = 0;

        for (int ele : a)
            System.out.print(ele + " ");

            System.out.println("heee");
    }
}
