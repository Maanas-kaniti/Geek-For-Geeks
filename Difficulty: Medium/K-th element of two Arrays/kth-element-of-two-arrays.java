class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        if(a.length>b.length){
            return kthElement(b,a,k);
        }
        int l = Math.max(0,k-b.length);
        int r = Math.min(k,a.length);
        int ans = 0;
        while(l<=r){
            int mid = l+(r-l)/2;
            int part = k-mid;
            int a_left = (mid==0) ? Integer.MIN_VALUE : a[mid-1];
            int a_right = (mid==a.length) ? Integer.MAX_VALUE : a[mid];
            int b_left = (part==0) ? Integer.MIN_VALUE : b[part-1];
            int b_right = (part==b.length) ? Integer.MAX_VALUE : b[part];
            if(b_left>a_right){
                l = mid+1;
            }
            else if(a_left>b_right){
                r = mid-1;
            }
            else{
                return Math.max(a_left,b_left);
            };
        }
        
        return -1;
    }
}