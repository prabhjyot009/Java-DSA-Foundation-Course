package GeekForGeeks.School;

public class PatternSetOne {
    void printPat(int n) {
        int x = n;
        pattern(n, x);
    }

    public void pattern(int n, int x) {
        if (x == 0) {
            return;
        }
        for (int i = n; i > 0; i--) {

            for (int j = 0; j < x; j++) {
                System.out.print(i + " ");
            }
        }
        System.out.print("$");

        pattern(n, --x);

    }

    public static void main(String[] args) {
        PatternSetOne obj = new PatternSetOne();
        obj.printPat(3);
    }
}