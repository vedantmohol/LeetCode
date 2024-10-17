class Solution {
    public int maximumSwap(int num) {
        char nums[] = Integer.toString(num).toCharArray();
        int n = nums.length;
        int maxElement = nums[n-1];
        int maxIdx = n-1;
        int swapIdx1 = -1;
        int swapIdx2 = -1;

        for(int i=n-2; i>=0 ; i--){
            if(nums[i]>maxElement){
                maxElement = nums[i];
                maxIdx = i;
            }
            else if(nums[i]<maxElement){
                swapIdx1 = i;
                swapIdx2 = maxIdx;
            }

        }
        if(swapIdx1!=-1){
            char temp = nums[swapIdx1];
            nums[swapIdx1] = nums[swapIdx2];
            nums[swapIdx2] = temp;
        }

        return Integer.parseInt(new String(nums));
    }

}