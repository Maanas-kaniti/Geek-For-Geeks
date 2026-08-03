class Solution {
    public int rowWithMax1s(int[][] arr) {
        // code here
        int n = arr.length;
        int res = -1;
        int count = 0;
        for(int i = 0;i<n;i++){
            int l = 0;
            int c = arr.length-1;
            int r = arr[i].length-1;
            while(l<=r){
                int mid = l+(r-l)/2;
                if(arr[i][mid]>0){
                    if(arr[i][mid]==1) c=mid-1;
                    r = mid-1;
                }
                else l = mid+1;
            }
            // System.out.println(c);
            int m = arr[i].length-c-1;
            // System.out.println(m);
            if(m>count){
                count = m;
                res = i;
            }
        }
        return res;
    }
}