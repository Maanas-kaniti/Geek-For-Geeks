import java.util.*;
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> nums = new ArrayList<>();
        int max = arr[arr.length-1];
        nums.add(max);
        int i = arr.length-2;
        while(i>=0){
            if(arr[i]>=max){
                nums.add(arr[i]);
                max = arr[i];
                
            }
            
            i--;
        }
        Collections.reverse(nums);
        return nums;
    }
}
