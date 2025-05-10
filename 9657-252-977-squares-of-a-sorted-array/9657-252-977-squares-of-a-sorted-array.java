class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int leftIdx = 0, rightIdx = n-1;
        int[] res = new int[n];
        int idx = n-1;

        while(leftIdx <= rightIdx){
            int left = nums[leftIdx] * nums[leftIdx];
            int right = nums[rightIdx] * nums[rightIdx];

            if(left>right){
                res[idx--] = left;
                leftIdx++;
            }else{
                res[idx--] = right;
                rightIdx--;
            }
        }

        return res;
    }
}
