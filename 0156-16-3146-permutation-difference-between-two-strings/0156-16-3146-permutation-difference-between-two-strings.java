class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum=0;

        for(int i=0 ; i<s.length() ; i++){
            char curr1 = s.charAt(i);
            for(int j=0 ; j<t.length() ; j++){
                char curr2 = t.charAt(j);
                if(curr1 == curr2){
                    sum += Math.abs(j-i);
                }
            }
        }
        return sum;
    }
}