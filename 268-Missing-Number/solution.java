public class Solution {
    public int missingNumber(int[] nums) {
        /*
        int m = 0;
		int N = nums.length;
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i=0; i<N; i++) {
			hs.add(nums[i]);
		}
		if(!hs.contains(Integer.valueOf(N))) m = N;
		else {
			for (int i=0; i<N; i++) {
				if(!hs.contains(Integer.valueOf(i))) m = i;
			}
		}
		return m; */
		
		/*
		int m = 0;
		int N = nums.length;
		int[] counter = new int[N+1];
		for (int i=0; i<N; i++) {
			if (nums[i]==0){
				counter[nums[i]] = -1;
			}else counter[nums[i]] = nums[i];
		}
		
		for (int i=0; i<counter.length; i++) {
			if (counter[i]==0) {
			    m = i;
			    break;
			}
		}
		return m;*/
		
		int m = 0;
		int N = nums.length;
		int Sn = N*(N+1)/2;
		int sum = 0;
		for (int i=0; i<N; i++) {
			sum += nums[i];
		}
		return m = Sn - sum;
		
    }
}