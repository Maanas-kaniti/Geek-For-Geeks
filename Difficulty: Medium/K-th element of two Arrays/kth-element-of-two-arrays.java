class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int i = 0;
        int j = 0;
        int ans = 0;
        while(i<a.length || j<b.length){
            if(i<a.length && j<b.length){
                if(a[i]==b[j]){
                    k--;
                    if(k==0) ans = a[i];
                    i++;
                    k--;
                    if(k==0) ans = b[j];
                    j++;
                }
                else if(a[i]<b[j]){
                    k--;
                    if(k==0){
                        ans = a[i];
                    }
                    i++;
                }
                else if(b[j]<a[i]){
                    k--;
                    if(k==0){
                        ans = b[j];
                    }
                    j++;
                }
            }
            else if(i<a.length){
                k--;
                if(k==0) ans = a[i];
                i++;
            }
            else{
                k--;
                if(k==0) ans = b[j];
                j++;
            }
        }
        return ans;
    }
}