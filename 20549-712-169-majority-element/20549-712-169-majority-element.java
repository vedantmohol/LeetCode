class Solution {
    public int majorityElement(int[] nums) {
        int count=0, n = nums.length;
        Arrays.sort(nums);
        int target = nums[n/2];

        for(int num : nums){
            if(num == target){
                count++;
            }
        }

        return (count > n/2) ? target : -1;
    }
}