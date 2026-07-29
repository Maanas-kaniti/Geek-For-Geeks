import java.util.*;
class Solution {
    int minSubsets(int arr[]) {
        // code here
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        int count = 0;
        if(arr.length==1) return 1;
        List<Integer> res = new ArrayList<>();
        for(int i = 0;i<arr.length-1;i++){
            
            if(arr[i+1]-arr[i]==1){
                res.add(arr[i]);
                map.put(count,res);
            }
            else{
                res.add(arr[i]);
                map.put(count,res);
                res = new ArrayList<>();
                count+=1;
            }
        }
        if(arr[arr.length-1]-arr[arr.length-2]==1){
            res.add(arr[arr.length-1]);
            map.put(count,res);
        }
        else{
            res = new ArrayList<>();
            res.add(arr[arr.length-1]);
            count++;
            map.put(count,res);
        }
        // System.out.println(map.toString());
        return map.size();
    }
}