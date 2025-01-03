class Solution {
    public int waysToSplitArray(int[] nums) {
        int count=0;
        long l=0,r=0;
        for(int num: nums){
            r += num;
        }
        for(int i=0 ; i<nums.length-1 ; i++){
            l += nums[i];
            r -= nums[i];
            if(l>=r){
                count++;
            }
        }
        return count;
    }
}