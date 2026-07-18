class Solution {
    public int minTime(int[] arr, int k) {
        // code here
        int l = arr[0];
        int r = 0;
        for(int n: arr){
            l = Math.max(l,n);
            r +=n;
        }
        int ans = 0;
        while(l<=r){
            int mid = l+(r-l)/2;
            int count = 0;
            int time = 1;
            for(int i = 0;i<arr.length;i++){
                if(count+arr[i]<=mid){
                    count+=arr[i];
                }
                else{
                    time++;
                    count = arr[i];
                }
            }
            if(time<=k){
                ans = mid;
                r = mid-1;
            }
            else l = mid+1;
        }
        return ans;
    }
}
