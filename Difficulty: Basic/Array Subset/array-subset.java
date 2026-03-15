import java.util.*;
class Solution {
    
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        if(b.length>a.length){
            return false;
        }
        for(int num : a){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        for(int num : b){
            if(!map.containsKey(num) || map.get(num)==0){
                return false;
            }
            map.put(num,map.get(num)-1);
        }
        
        return true;
    }
    
}
