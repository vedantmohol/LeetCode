class Solution {
    public static List<String> wordSubsets(String[] words1, String[] words2) {
        final int characters[] = new int[26];
        List<String> subset = new ArrayList<>();

        for(String w: words2){
            int count[] = new int[26];
            for(char c : w.toCharArray()){
                count[c-'a']++;
            }
            for(int i=0 ; i<26 ; ++i){
                characters[i] = Math.max(characters[i],count[i]);
            }
        }
        for(String word : words1){
            int count[] = new int[26];
            for(char w : word.toCharArray()){
                count[w-'a']++;
            }
            boolean isValid = true;
            for(int i=0 ; i<26 ; ++i){
                if(count[i]<characters[i]){
                    isValid = false;
                    break;
                }
            }
            if(isValid){
            subset.add(word);
            }
        }
        return subset;
    }
}