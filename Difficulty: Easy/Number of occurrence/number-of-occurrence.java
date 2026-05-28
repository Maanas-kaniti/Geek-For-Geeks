class Solution {
    int countFreq(int[] arr, int x) {
        // code here
        int l = 0;
        int r = arr.length-1;
        int c = -1;
        int f = -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]>=x){
                if(arr[mid]==x) f = mid;
                r = mid-1;
            }else l = mid + 1;
            
        }
        l = 0;
        r = arr.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]<=x){
                if(arr[mid]==x) c = mid;
                l = mid+1;
            }else r = mid - 1;
        }
        // System.out.println(c+" "+f);
        
        if(c==-1 && f==-1) return 0;
        else return c-f+1;
    }
}
