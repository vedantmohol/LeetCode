class Solution {
    public int xorOperation(int n, int start) {
        int bXOR=0;
        for(int i=0 ; i<n ; i++){
            bXOR ^= start + 2*i;
        }
        return bXOR;
    }
}