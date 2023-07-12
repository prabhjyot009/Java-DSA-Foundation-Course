package Arrays;
class lengthArray{
    void Arraysss(){
        int[] ages=new int[3];
        float[] weights=new float[3];
        String[] names=new String[3];

        ages[0]=12;
        ages[1]=29;
        ages[2]=56;
        System.out.println(ages.length);
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
    }
}
public class LengthOfArray {
    public static void main(String[] args) {
        lengthArray obj=new lengthArray();
        obj.Arraysss();
    }
}
