class Solution {
    public int coin(int[] arr) {
        // code here
        int i = 0;
        int j = arr.length-1;
        while(i<=j){
            if(arr[i]>=arr[j]) i++;
            else j--;
        }
        return arr[j];
    }
}