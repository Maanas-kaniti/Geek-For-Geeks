class Solution {
    public double minMaxDist(int[] stations, int K) {
        // code here
        double l = 0.0;
        double r = Double.MIN_VALUE;
        for(int i = 0;i<stations.length-1;i++){
            // l = Math.min(l,stations[i+1]-stations[i]);
            r = Math.max(r,stations[i+1]-stations[i]);
        }
        // System.out.println(l + " "+ r);
        double ans = 0;
        if(l==r) return l;
        double diff = 1e-6;
        while(r-l>diff){
            double mid = l+(r-l)/2;
            // System.out.println(l + " "+ mid + " "+ r);
            int m = 0;
            int count = 0;
            for(int i = 0;i<stations.length-1;i++){
                int gap = stations[i+1]-stations[i];
                int req = (int)(gap/mid);
                if(gap==req*mid) req--;
                    // System.out.println(m);
                m+=req;
            }
            // System.out.println(mid + " " + m);
            // System.out.println(m);
            if(m>K){
                ans = mid;
                l = mid;
            }
            else r = mid;
            
        }
        return r;
    }
}   
