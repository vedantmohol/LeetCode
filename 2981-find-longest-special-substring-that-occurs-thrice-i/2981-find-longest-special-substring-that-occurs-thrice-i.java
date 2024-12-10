class Solution {
    public int maximumLength(String s) {
        HashMap<String,Integer> map = new HashMap<>();
        int n = s.length();
        for(int i=0 ; i<n ; i++){
            StringBuilder curr = new StringBuilder();
            for(int j=i ; j<n ; j++){
                if(curr.length()==0 || s.charAt(j)==curr.charAt(curr.length()-1)){
                    curr.append(s.charAt(j));
                    String cur = curr.toString();
                    map.put(cur,map.getOrDefault(cur,0)+1);
                }
                else{
                    break;
                }
            }
        }
        int maxLength =-1;
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            String str = entry.getKey();   
            int freq = entry.getValue();
            if(freq>2){
                maxLength = Math.max(maxLength,str.length());
            } 
        }
        return maxLength;
    }
}