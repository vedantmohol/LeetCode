class Solution {
    public int minimumLength(String s) {
        if(s.length()<=2){
            return s.length();
        }
        int arr[] = new int[26];
        for(int i=0 ; i<s.length() ; i++){
            arr[s.charAt(i)-'a']++;
        }
        int count = 0;
        for(int i=0 ; i<26 ; i++){
            if(arr[i]%2!=0 && arr[i]!=0){
                count++;
            }
            else if(arr[i]%2==0 && arr[i]!=0){
                count += 2;
            }
        }
        return count;
    }
}