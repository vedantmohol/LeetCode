class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        HashSet set = new HashSet<>();
        for(char ch:allowed.toCharArray()){
            set.add(ch);
        }
        for(String word:words)
        {
            boolean isMatch = true;
            for(char ch: word.toCharArray())
            {
                if(!set.contains(ch)){
                  isMatch = false;
                  break;
                }
            }
            if(isMatch)
            {
                count++;
            }
        }
        return count;
    }
}