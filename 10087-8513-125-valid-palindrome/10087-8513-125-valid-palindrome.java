class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==1){
            return true;
        }

        s = s.toLowerCase();
        StringBuilder result = new StringBuilder();

        for(int i=0 ; i<s.length() ; i++){
            if(isAlphaNum(s.charAt(i))){
                result.append(s.charAt(i));
            }
        }

        int left=0, right = result.length()-1;
        while(left<=right){
            if(result.charAt(left) != result.charAt(right)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }

    public boolean isAlphaNum(char curr){
        return Character.isLetterOrDigit(curr);
    }
}