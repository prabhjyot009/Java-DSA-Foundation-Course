package OOPSconcept.Constructors;
class Algebra{
    int a;
    int b;
    // Algebra(){//default constructor
    //     System.out.println("Constructor called");
    // }
    Algebra(int x,int y){//parameterized constructor
        System.out.println("Constructor called");
        a=x;
        b=y;
    }
    int sum(){
        int ans=a+b;
        return ans;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
}
public class Constructors {
    public static void main(String[] args) {
        Algebra obj=new Algebra(5,7);
        int ans1=obj.sum();
        System.out.println(ans1);
        int ans2=obj.sub();
        System.out.println(ans2);
        int ans3=obj.mul();
        System.out.println(ans3);

        Algebra obj2=new Algebra(2,2);
        int ans11=obj2.sum();
        System.out.println(ans11);
        int ans21=obj2.sub();
        System.out.println(ans21);
        int ans31=obj2.mul();
        System.out.println(ans31);

    }
}
