class Solution {
    public static void swap(int[] nums,int i,int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
    }

    public static void reverseArray(int[] nums,int i,int j){
        int left=i , right=j;
        while(left<right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i=n-2,j=0;
    
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            j = n-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }

        reverseArray(nums,i+1,n-1);
    }
}