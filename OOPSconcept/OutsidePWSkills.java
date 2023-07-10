package OOPSconcept;

import OOPSconcept.pw.skills.AccessModifiers;

/**
 * OutsidepwSkills
 */
public class OutsidePWSkills {
    public static void main(String[] args) {
        AccessModifiers obj=new AccessModifiers();
        System.out.println("Outside package, non-child class "+obj.str_1);
        AccessModifiers3 obj3=new AccessModifiers3();
        obj3.printFromChildClass();
    }
}
      //child class            //parent class
class AccessModifiers3 extends AccessModifiers{ //child class of AccessModfiers class(inheritance)
    void printFromChildClass(){
        AccessModifiers3 obj3=new AccessModifiers3();
        System.out.println("Child Class "+obj3.str_1);
    }
}