package OOPSconcept;

class Student {
    int rollno;
    String classname;

}

public class Main {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.rollno = 22;
        obj1.classname = "Ram";
        System.out.println(obj1.rollno);
        System.out.println(obj1.classname);

        Student obj2 = new Student();
        obj2.rollno = 26;
        obj2.classname = "Shyam";
        System.out.println(obj2.rollno);
        System.out.println(obj2.classname);
    }
}
