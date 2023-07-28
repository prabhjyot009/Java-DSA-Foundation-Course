package OOPSconcept;

public class FinalKeyword {
    String name;
    int rno;
    double percent;
    final String schoolName="DPS";
    public static void main(String[] args) {
        FinalKeyword obj=new FinalKeyword();
        obj.name="Raghav";
        obj.rno=21;
        obj.percent=34;
        obj.schoolName="DPS";
        System.out.println(obj.schoolName);
    }
}