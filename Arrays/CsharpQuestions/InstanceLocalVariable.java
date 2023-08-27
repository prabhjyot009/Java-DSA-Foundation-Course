package Arrays.CsharpQuestions;

/**
 * InstanceLocalVariable
 */
public class InstanceLocalVariable {

    int a=10; //instance variable
    public static void main(String[] args) {
        int c=30; //local variable
        InstanceLocalVariable obj=new InstanceLocalVariable();
        System.out.println(obj.a);    
        System.out.println(c);
    }
}

//Description:

//Instance variable: declared inside the class but outside the method or constructor or block.
//Local variable: declared inside the method or constructor or block.

//Objective: To understand the difference between instance and local variable.

//How to create and access the class component library (.dll) and consume that file in the console application?
//step 1: create a class library project
//step 2: create a class and write the code
//step 3: build the project
//step 4: go to the project folder and find the bin folder
//step 5: go to the debug folder and find the .dll file
//step 6: create a console application project
//step 7: right click on the project and click on add reference
//step 8: click on browse and select the .dll file
//step 9: click on ok
//step 10: write the code to consume the .dll file
//step 11: build the project
//step 12: run the project