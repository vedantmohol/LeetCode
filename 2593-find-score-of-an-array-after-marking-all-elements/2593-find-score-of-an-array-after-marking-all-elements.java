class Solution {
    public long findScore(int[] nums) {
        int n = nums.length;
        long res = 0;
        int copy[][] = new int[n][2];
        for(int i=0 ; i<n ; i++){
            copy[i][0] = nums[i];
            copy[i][1] = i;
        }

        Arrays.sort(copy, (a,b)->a[0] - b[0]);

        for(int i=0 ; i<n ; i++){
            int element = copy[i][0];
            int idx = copy[i][1];
            if(nums[idx]<0) continue;
            res += nums[idx];
            nums[idx] = -nums[idx];
            if(idx-1>=0 && nums[idx-1]>0){
                nums[idx-1] = -nums[idx-1];
            }
            if(idx+1<n && nums[idx+1]>0){
                nums[idx+1] = -nums[idx+1];
            }
        }
        return res;
    }
}