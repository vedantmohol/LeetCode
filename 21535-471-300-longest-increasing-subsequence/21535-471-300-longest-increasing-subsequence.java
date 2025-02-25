class Solution {
    public int lengthOfLIS(int[] nums) {
        TreeSet<Integer> st = new TreeSet<>();
        // st.add(nums[0]);
        for(int i=0 ; i<nums.length ; i++){
            Integer curr = st.ceiling(nums[i]);
            if(curr == null){
                st.add(nums[i]);
            }
            else{
                st.remove(curr);
                st.add(nums[i]);
            }
        }
        
        return st.size();
    }
}