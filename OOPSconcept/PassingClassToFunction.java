package OOPSconcept;

public class PassingClassToFunction {
    // public static void fun(int x) {
    //     System.out.println(x);
    //     return;
    // }
        public static class Student{
            String name;
            int rollno;
            double percent;
        }
        public static void fun(Student x) {
        System.out.println(x.name);
        return;
    }
    public static void main(String[] args) {
        // int x=5;
        // fun(x+6);

        Student obj=new Student();
        obj.name="Harsh";
        obj.rollno=21;
        obj.percent=98;

        fun(obj  );
    }
}
