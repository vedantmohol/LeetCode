class Solution {
    public int maximumBeauty(int[] nums, int k) {
        if(nums.length==1) return 1;

        int max = 0;
        for(int num : nums){
            max = Math.max(max,num);
        }

        int count[] = new int[max+1];
        for(int num : nums){
            count[Math.max(num-k,0)]++;
            count[Math.min(num+k+1,max)]--;
        }

        int currSum = 0;
        int maxSum = 0;

        for(int c : count){
            currSum += c;
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }
}