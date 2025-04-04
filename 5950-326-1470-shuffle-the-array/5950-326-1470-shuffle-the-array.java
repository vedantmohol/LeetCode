class Solution {
    public int[] shuffle(int[] nums, int n) {
        int j=0;
        int ans[] = new int[nums.length];

        for(int i=0 ; i<nums.length ; i+=2){
            ans[i] = nums[j];
            ans[i+1] = nums[j+n];
            j++;
        }
        return ans;
    }
}