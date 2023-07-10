package OOPSconcept.MethodsAndScopes;
class Algebra{
    int a=10;//member variables
    int b=20;

    int add(){
        int p=100;
        int q=20;
        return p+q;
    }
    
    int sub(){
        // return p-q; error
        int p=24;
        int q=90;
        return p-q;
    }
}
public class MethodLevelScope {
    public static void main(String[] args) {
        
    }
}
