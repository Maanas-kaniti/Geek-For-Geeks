class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int l = 0;
        int r = arr.length-1;
        int min = Integer.MAX_VALUE;
        int f = 0;
        while(l<=r){
            int mid = l+(r-l)/2;
            // System.out.println(l+" "+mid+" "+r);
            if(arr[mid]<=arr[r]){
                if(arr[mid]<min){
                    min = arr[mid];
                    f = mid;
                }
                r = mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return f;
    }
}