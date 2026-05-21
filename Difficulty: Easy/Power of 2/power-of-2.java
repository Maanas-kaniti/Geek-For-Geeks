class Solution {
    public static boolean isPowerofTwo(int n) {
        // code here
        int count = 0;
        int t = n;
        int d = 0;
        if(n==0) return false;
        while(t>0){
            d = t%2;
            if(d==1){
                count++;
            }
            if(count>1) return false;
            n=n/2;
            t = n;
        }
        return true;
    }
}