import java.util.*;
class Solution {
    public int findIndex(String s) {
        // code here
        int open = 0;
        int close = 0;
        int count = 0;
        for(char c : s.toCharArray()){
            if(c==')') close++;
        }
        for(int i = 0;i<s.length();i++){
            count++;
            if(s.charAt(i)=='(') open++;
            else close--;
            if(open==close) break;
        }
        if(open==close) return count;
        else return 0;
    }
    
}