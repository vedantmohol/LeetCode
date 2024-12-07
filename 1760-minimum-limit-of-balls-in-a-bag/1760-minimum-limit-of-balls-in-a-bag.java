class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int r=0;
        for(int num : nums){
            r = Math.max(num,r);
        }
        int l=1;
        int ans=0;

        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(nums,mid,maxOperations)){
                ans = mid;
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return ans;
    }

    public boolean isPossible(int nums[],int mid,int maxOperations){
        int operation=0;
        for(int num : nums){
            if(num>mid){
                int bags = (int) Math.ceil(num / (double) mid);
                operation += bags - 1;
            }
            if(operation>maxOperations){
                return false;
            }
        }
        return true;
    }
}