package Arrays;

public class ReverseString {
    //reverse string using two pointer approach use String only not char array
    static String reverseString(String s){
        int n=s.length();
        int left=0,right=n-1;
        char[] arr=s.toCharArray();
        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String s="hello";
        System.out.println(reverseString(s));
    }

}
