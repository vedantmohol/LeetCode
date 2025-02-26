class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1 || n==2){
            return true;
        }
        if(n<1){
            return false;
        }
        return (n & (n-1)) == 0 ? true : false;
    }
}