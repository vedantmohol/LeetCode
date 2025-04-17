class Solution {
    public int smallestNumber(int n) {
        int result = 0;
        int num=1;
        boolean isTrue = false;

        while(!isTrue){
            if((2*num)-1 >= n){
                isTrue = true;
                result = (2*num)-1;
            }else{
                num = (2 * num);
            }
        }
        
        return result;
    }
}