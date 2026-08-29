import java.util.*;
class Solution {
    public int countSubstr(String s, int k) {
        //  code here
        HashMap<Character,Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int count = 0;
        while(j<s.length()){
            char ch = s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
            while(map.size()>k){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i))==0) map.remove(s.charAt(i));
                i++;    
            }
            count += j-i+1;
            j++;
        }
        i = 0;
        j = 0;
        int c = 0;
        k = k-1;
        map = new HashMap<>();
        while(j<s.length()){
            char ch = s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()>k){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i))==0) map.remove(s.charAt(i));
                i++;    
            }
            c+= j-i+1;
            j++;
        }
        return count-c;
    }
}