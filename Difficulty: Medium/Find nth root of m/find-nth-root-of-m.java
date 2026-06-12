class Solution {
    public int nthRoot(int n, int m) {
        // code here
        int l = 0;
        int r = m;
        while(l<=r){
            int mid = l+(r-l)/n;
            if((long)Math.pow(mid,n)==m){
                return mid;
            }
            else if((long)Math.pow(mid,n)<m){
                l = mid+1;
            }
            else r = mid-1;
        }
        return -1;
    }
}