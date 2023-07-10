package OOPSconcept;


public class PassByValue {

    static void changeValue(int a){
        a*=100;
        System.out.println("inside change value:"+a);
    }

    public static void main(String[] args) {
        int a=10;
        System.out.println("Before changing value"+a);
        changeValue(a);
        System.out.println("After changing value"+a);
    }
}