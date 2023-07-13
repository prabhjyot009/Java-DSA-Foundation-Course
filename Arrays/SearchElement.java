package Arrays;
class searchArray{
    void searchh(){
        int[] arr={81,3,6,2,8,3,1};
        int search=3;
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                ans=i;
                break;
            }
        }
        if(ans==-1){
            System.out.print("Not found");
        }else{
        System.out.print(search+" Item found at index:"+ans);
    }}
}
public class SearchElement {
    public static void main(String[] args) {
        searchArray obj=new searchArray();
        obj.searchh();
    }
}
