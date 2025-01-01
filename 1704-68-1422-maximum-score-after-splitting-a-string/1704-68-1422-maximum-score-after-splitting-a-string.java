class Solution {
    public int maxScore(String s) {
        int maxScore = 0;
        int sumOne = 0;
        int sumZero = 0;

        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)=='1'){
                sumOne++;
            }
        }
        for(int i=0 ; i<s.length()-1 ; i++){
            if(s.charAt(i)=='0'){
                sumZero++;
            }
            else{
                sumOne--;
            }
            maxScore = Math.max(maxScore,sumZero+sumOne);
        }
        
        return maxScore;
    }
}