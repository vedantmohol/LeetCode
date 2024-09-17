class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> h = new HashMap<>();
        
        for(String word: s1.split(" ")){
            h.put(word,h.getOrDefault(word,0)+1);
        }
        for(String word: s2.split(" ")){
            h.put(word,h.getOrDefault(word,0)+1);
        }
        ArrayList<String> l = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : h.entrySet()){
            if(entry.getValue()==1){
                l.add(entry.getKey());
            }
        }
        String uncommon[] = new String[l.size()];
        l.toArray(uncommon);
        return uncommon;
    }
}