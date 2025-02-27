class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        if(n==0){
            return false;
        }
        if(n>1){
            return (n%4==0) && isPowerOfFour(n/4);
        }else{
            return false;
        }
    }
}