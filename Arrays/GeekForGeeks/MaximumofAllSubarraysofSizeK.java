package Arrays.GeekForGeeks;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class MaximumofAllSubarraysofSizeK {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,4,5,2,3,6};
        int k=3;
        System.out.println(maximumOfAllSubarrays(arr,k));
    }
    static ArrayList<Integer> maximumOfAllSubarrays(int[] arr,int k){
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;
        int max=Integer.MIN_VALUE;
        Deque<Integer> deque=new LinkedList<>();
        while (j<arr.length) {
            while (deque.size()>0 && deque.peekLast()<arr[j]) {
                deque.removeLast();
            }
            deque.addLast(arr[j]);
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                list.add(deque.peekFirst());
                if(arr[i]==deque.peekFirst()){
                    deque.removeFirst();
                }
                i++;
                j++;
            }
        }
        return list;
    }
}
