import java.util.*;
class Solution {
    public boolean checkElements(int start, int end, int[] arr) {
        // code here
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        boolean flag = true;
        for(int i = start;i<end+1;i++){
            if(map.get(i)==null) flag = false;
        }
        return flag;
    }
}