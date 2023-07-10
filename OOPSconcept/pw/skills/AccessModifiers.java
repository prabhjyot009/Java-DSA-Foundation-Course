package OOPSconcept.pw.skills;

public class AccessModifiers {

    public String str_1="i am a public member";
    //protected String str_1="i am a public member";
    //default//String str_1="i am a public member";
    //private String str_1="i am a public member";


    void printfromclass(){
        System.out.println("Within class:"+str_1);
    }
    public static void main(String[] args) {
        AccessModifiers obj=new AccessModifiers();
        obj.printfromclass();
        System.out.println("Within class:"+obj.str_1);
        AccessModifiers2 obj2 =new AccessModifiers2();
        obj2.printFromOutsideClass();
    }
}
class AccessModifiers2{
    void printFromOutsideClass(){
        AccessModifiers obj=new AccessModifiers();
        System.out.println("Within pakage, outside class:"+obj.str_1);

    }
}