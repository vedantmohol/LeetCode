class Solution {
    // public HashMap<> permutation(String s1,String permutation){
    //     HashMap<String> per = new HashMap<>();
    //     if(s1.length == 0){
    //         per.add(permutation+" ");
    //         return;
    //     }
    //     for(int i=0 ; i<s1.length ; i++){
    //         char curr = s1.charAt(i);
    //         String newStr = s1.substring(0,i)+s1.substring(i+1);
    //         per.add(newStr);
    //         permutation(newStr,permutation+curr);
    //     }
    //     return per;
    // }
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if(m<n) return false;

        int map1[] = new int[26];

        for(int i=0 ; i<n ; i++){
            map1[s1.charAt(i)-'a']++;
        }

        for(int i=0 ; i<=m-n ; i++){
        int map2[] = new int[26];
            for(int j=0 ; j<n ; j++){
                map2[s2.charAt(i+j)-'a']++;
            }
        if(isMatched(map1,map2)){
            return true;
        }
        }
        return false;
    }

    public boolean isMatched(int map1[],int map2[]){
        for(int i=0 ; i<26 ; i++){
            if(map1[i]!=map2[i]) return false;
        }
        return true;
    }
}