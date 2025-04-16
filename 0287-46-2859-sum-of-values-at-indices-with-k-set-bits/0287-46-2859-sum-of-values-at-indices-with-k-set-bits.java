class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int result=0;

        for(int i=0 ; i<nums.size() ; i++){
            int count = Integer.bitCount(i);
            if(count==k){
                result+=nums.get(i);
            }
        }
        return result;
    }
}