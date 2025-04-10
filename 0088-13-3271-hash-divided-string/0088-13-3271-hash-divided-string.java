class Solution {
    public String stringHash(String s, int k) {
        String res="";
        int sum = 0;

        for(int i=0 ; i<s.length() ; i++){
            sum += (int)(s.charAt(i)-'a');
            if((i+1)%k==0){
                res += (char)(sum%26+'a');
                sum=0;
            }
        }
        return res;
    }
}