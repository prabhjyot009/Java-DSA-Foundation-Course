package OOPSconcept;

public class Lecture17MCQ {
    public static void temp(int p) {
        int q=p;
        q-=100;
    }
    public static void main(String[] args) {
        int p=890;
        temp(p);
        System.out.println(p);
        //error: System.out.println(q);
    }
}
