class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        
        int start = 0, end = n-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid > 0 && nums[mid]<nums[mid-1]){
                end = mid -1;
            }else if(mid<n-1 && nums[mid+1]>nums[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}