class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefixProduct=1;
        int suffixProduct=1;
        int answer[] = new int[nums.length];

        for(int i=0 ; i<nums.length ; i++){
            answer[i] = 1;
        }

        for(int i=0 ; i<nums.length ; i++){
           answer[i] *= prefixProduct;
           prefixProduct *= nums[i];
        }

        for(int i=nums.length-1 ; i>=0 ; i--){
            answer[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }
        
        return answer;
    }
}