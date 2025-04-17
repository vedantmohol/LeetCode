class Solution {
    public int countPairs(int[] nums, int k) {
        int count=0;
        for(int i=0 ; i<nums.length ; i++){
            for(int j=i ; j<nums.length ; j++){
                if(nums[j]==nums[i] && (i*j)%k==0 && i<j){
                    count++;
                }
            }
        }
        return count;
    }
}