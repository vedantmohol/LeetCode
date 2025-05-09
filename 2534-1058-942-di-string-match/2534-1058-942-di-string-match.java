class Solution {
    public int[] diStringMatch(String s) {
        int D = s.length();
        int I = 0;
        int res[] = new int[s.length()+1];

        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)=='I'){
                res[i] = I;
                I++;
            }else{
                res[i] = D;
                D--;
            }
        }
        res[s.length()] = D;
        return res;
    }
}