class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        int count=0;
        int x=0,y=0;
        for(int i=0 ; i<s1.length() ; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                count++;
            if(count>2){
                return false;
            }
            else{
                if(count==1){
                    x=i;
                }else{
                    y=i;
                }
            }
            }
        }
        return (s1.charAt(x)==s2.charAt(y)) && (s2.charAt(x)==s1.charAt(y));
    }

}