import java.util.*;
class Solution {
    public int aggressiveCows(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int l = 1;
        int r = arr[arr.length-1]-arr[0];
        int ans = 0;
        while(l<=r){
            int mid = l+(r-l)/2;
            int m = arr[0];
            int count = 1;
           for(int i = 1;i<arr.length;i++){
              if(arr[i]-m>=mid){
                  m = arr[i];
                  count++;
              }
           }
            if(count>=k){
                ans = mid;
                l = mid+1;
            }
            else r = mid-1;
        }
        return ans;
    }
}