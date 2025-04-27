class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int value[] = new int[26];

        for(int i=0 ; i<value.length ; i++){
            value[i] = 26-i;
        }

        for(int i=0 ; i<s.length() ; i++){
            sum += (i+1)*(value[s.charAt(i)-'a']);
        }
        return sum;
    }
}