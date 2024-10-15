class Solution {
    public long minimumSteps(String s) {
        int n = s.length();
        long swapCount = 0;
        int last=0;
        for(int curr = 0 ; curr<n ; curr++){
            if(s.charAt(curr) == '1'){
                continue;
            }
            else{
                swapCount += (curr-last);
                last++;
            }
        }
        return swapCount;
    }
}