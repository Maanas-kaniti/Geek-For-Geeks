class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        if(k>arr.length) return -1;
        long l = arr[0];
        long r = 0;
        for(int n : arr){
            l = Math.max(n,l);
            r+=n;
        }
        int ans = -1;
        while(l<=r){
            long mid = l + (r-l) /2;
            // System.out.println(l + " " + mid + " "+ r);
            long sum = 0;
            int m = 1;
            for(int i=0;i<arr.length;i++){
                if(sum+arr[i]<=mid){
                    sum+=arr[i];
                }
                else{
                    m++;
                    sum = arr[i];
                }
            }
            if(m<=k){
                ans =(int)mid;
                r = mid-1;
            }
            else l = mid+1;
            
        }
        return ans;
    }
}