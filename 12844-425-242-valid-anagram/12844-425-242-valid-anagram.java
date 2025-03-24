class Solution {
    public boolean isAnagram(String s, String t) {
        int[] array = new int[26];
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0 ; i<s.length() ; i++){
            array[s.charAt(i)-'a']++;
        }
        for(int i=0 ; i<t.length() ; i++){
            if(array[t.charAt(i)-'a'] == 0){
                return false;
            }else{
                array[t.charAt(i)-'a']--;
            }
        }
        return true;
    }
}