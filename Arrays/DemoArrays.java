package Arrays;

class Arrayss{
    void Arraysss(){
        int[] ages=new int[3];
        float[] weights=new float[3];
        String[] names=new String[3];

        ages[0]=12;
        ages[1]=29;
        ages[2]=56;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
    }
}
public class DemoArrays {
    public static void main(String[] args) {
        Arrayss obj=new Arrayss();
        obj.Arraysss();
    }
}
