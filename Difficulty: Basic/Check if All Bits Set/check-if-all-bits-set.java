import java.util.*;
class Solution {
    public boolean isBitSet(int n) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        int d = 0;
        int t = n;
        while(t>0){
            d = t%2;
            set.add(d);
            n = n/2;
            t = n;
        }
        return set.size()==1;
    }
};