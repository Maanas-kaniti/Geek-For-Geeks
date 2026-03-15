import java.util.*;
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int i = 0;
        int j = 0;
       int  win = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        while(j<arr.length){
            win+=arr[j];
            while(win>target){
                win-=arr[i];
                i++;
            }
            if(win==target){
                nums.add(i+1);
                nums.add(j+1);
                break;
            }
            j++;
            
        }
        if(nums.isEmpty()){
            nums.add(-1);
        }
        
        return nums;
        
    }
}
