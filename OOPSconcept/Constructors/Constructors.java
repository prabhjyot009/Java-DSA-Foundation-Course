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
        // Scanner sc=new Scanner(System.in);
        // int x=sc.nextInt();
        // int y=sc.nextInt();
        int ans1=obj.sum();
        System.out.println(ans1);
        int ans2=obj.sum();
        System.out.println(ans2);
        int ans3=obj.sum();
        System.out.println(ans3);

    }
}
