class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int target=0;
        for(int num : nums){
            target |=num;
        }
        return rec(0,nums,0,target);
    }

    public int rec(int idx,int nums[],int curr,int target){
        if(idx==nums.length){
            return (curr == target) ? 1 : 0;
        }

        int pickCount = rec(idx+1,nums,curr | nums[idx],target);

        int nopickCount = rec(idx+1,nums,curr,target);

        return pickCount + nopickCount;
    }
}
