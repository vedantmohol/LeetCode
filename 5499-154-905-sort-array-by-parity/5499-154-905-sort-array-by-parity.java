class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int idx1=0,idx2=nums.length-1;

        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]%2!=0){
                res[idx2] = nums[i];
                idx2--;
            }else{
                res[idx1] = nums[i];
                idx1++;
            }
        }
        return res;
    }
}