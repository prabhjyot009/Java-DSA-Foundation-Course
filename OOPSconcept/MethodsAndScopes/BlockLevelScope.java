package OOPSconcept.MethodsAndScopes;
    class Algebraa{

        void demo(){
            int a=5;
            System.out.println(a);
            //error: System.out.println(b);
            for (int i = 0; i < 5; i++) //loop in block level
            {
                int b=10;
                System.out.println(b); //10
            }
            //Error: System.out.println(i);
            //error: System.out.println(b);
            if(true)
            {
                int b=100;
                System.out.println(b); //100
            }
            //We can create new scope for i because scope is changed
            for(int i=0;i<2;i++){

            }
        }
    }
public class BlockLevelScope {
    public static void main(String[] args) {
        Algebraa obj=new Algebraa();
        obj.demo();
    }
}
