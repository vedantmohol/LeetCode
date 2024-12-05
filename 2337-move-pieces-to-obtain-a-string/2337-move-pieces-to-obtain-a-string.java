class Solution {
    public boolean canChange(String start, String target) {
        int i=0,j=0;
        int n=start.length();

        while(i<n || j<n){
            while(i<n && start.charAt(i)=='_'){
                i++;
            }
            while(j<n && target.charAt(j)=='_'){
                j++;
            }
            if(i==n || j==n){
                return (i==n && j==n);
            }

            if(start.charAt(i) != target.charAt(j) || 
            (start.charAt(i)=='L' && j>i)||
            (start.charAt(i)=='R' && j<i)){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}