class Solution {
    public int maxSum(int n) {
        int n1 = n/2;
        int n2 = n/3;
        int n3 = n/4;
        if(n1+n2+n3<=n){
            return n;
        }
        return maxSum(n/2)+maxSum(n/3)+maxSum(n/4);
    }
}
