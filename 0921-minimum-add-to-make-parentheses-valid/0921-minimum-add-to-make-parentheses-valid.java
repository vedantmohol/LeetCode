class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        int openCount=0;

        for(int i=0 ; i<s.length() ; i++){
            char curr = s.charAt(i);
            if(curr=='('){
                count++;

            }
            else if(count>0){
                count--;
            }
            else{
                openCount++;
            }
        }
        return openCount+count;
    }
}