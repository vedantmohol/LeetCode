class Solution {
    public boolean isEven(int num){
        int freq=1;

        while(num>9){
            num = num / 10;
            freq++;
        }

        return freq%2==0;
    }
    
    public int findNumbers(int[] nums) {
        int count=0;

        for(int num : nums){
            if((isEven(num))){
                count++;
            }
        }
        return count;
    }
}