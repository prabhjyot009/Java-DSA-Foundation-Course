package OOPSconcept.MethodsAndScopes;

public class BlockLevelScope {
    class Algebra{
        int a=10;//member variables
        int b=20;
    
        int add(){
            return a+b;
        }
        
        int sub(){
            return a-b;
        }
        
        int mul(){
            return a*b;
        }
    }
}
