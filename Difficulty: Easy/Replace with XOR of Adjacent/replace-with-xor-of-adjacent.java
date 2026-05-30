class Solution {
    public void replaceElements(int[] arr) {
        // code here
        int[] nums = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            if(i==0) nums[i] = arr[i]^arr[i+1];
            else if(i==arr.length-1) nums[i] = arr[i-1]^arr[i];
            else nums[i] = arr[i-1]^arr[i+1];
        }
        for(int i = 0;i<arr.length;i++){
            arr[i] = nums[i];
        }
    }
}