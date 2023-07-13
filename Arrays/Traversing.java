 package Arrays;

 class Traverse{
    void arrTraverseOneD(){
        int[] arr={12,19,29,4};
        System.out.println(arr.length);

        for(int i=0;i<=3;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int age:arr){
            System.out.print(age+" ");
        }
        System.out.println();
        int i=0;
        while(i<=3){
            System.out.print(arr[i]+" ");
            i+=1;
        }
    }
    void arrTraverseTwoD(){
        int[][] arr={{1,2,3},{4,5,6}};
        System.out.println(arr.length);
        System.out.println(arr.length);

        for(int i=0;i<=1;i++){
            for(int j=0;j<=2;j++){
            System.out.print(arr[i][j]+" ");
        }
    }
 }
}
 public class Traversing {
 
    public static void main(String[] args) {
        Traverse obj=new Traverse();
        obj.arrTraverseOneD();
        obj.arrTraverseTwoD();
    }
 }