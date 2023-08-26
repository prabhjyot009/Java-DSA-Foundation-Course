package Arrays.TwoPointers;

public class pushAllNonZerosToEnd {
    int[] nums={0,1,0,3,12};
    public void pushZeroes(int[] nums) {
        int n=nums.length;
        int left=0,right=0;
        while(right<n){
            if(nums[right]!=0){
                swap(nums,left,right);
                left++;
            }
            right++;
        }
    }
    public void swap(int[] nums,int left,int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }

    public static void main(String[] args) {
        pushAllNonZerosToEnd p=new pushAllNonZerosToEnd();
        p.pushZeroes(p.nums);
        for (int i = 0; i < p.nums.length; i++) {
            System.out.print(p.nums[i]+" ");
        }
    }
}
