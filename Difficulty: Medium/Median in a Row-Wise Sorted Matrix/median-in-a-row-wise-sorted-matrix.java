class Solution {
	public int median(int[][] mat) {
		// code here
		int len = mat.length*mat[0].length;
		int median = (len/2) + 1;
		int max = mat[0][0];
		int min = mat[0][0];
		for (int[] row : mat) {
			for (int num : row) {
				min = Math.min(min, num);
				max = Math.max(max, num);
			}
		}
		int l = min;
		int r = max;
		int ans = 0;
		while (l <= r) {
			int mid = l + (r - l)/2;
// 			System.out.println(mid);
			int count = 0;
			for (int[] row : mat) {
			    int c = 0;
			    int s = 0;
			    int e = row.length-1;
				while(s<=e){
				    int m = s+(e-s)/2;
				    if(row[m]<=mid){
				        c = m+1;
				        s = m+1;
				    }else e = m-1;
				}
				// System.out.println(c);
				count += c;
			}
			if(count>=median){
			    ans = mid;
			    r=mid-1;
			}else l = mid+1;
			
		}
		return ans;
	}
}
