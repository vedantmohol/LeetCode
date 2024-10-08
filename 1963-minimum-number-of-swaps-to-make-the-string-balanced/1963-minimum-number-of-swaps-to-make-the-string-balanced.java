class Solution {
    public int minSwaps(String s) {
        int count=0;
        Stack<Character> stack = new Stack<>();
        for(int i=0 ; i<s.length() ; i++){
            char curr = s.charAt(i);
            
            if(curr == '['){
                stack.push(curr);
                count ++;
            }
            else if(!stack.isEmpty()){
                stack.pop();
                count--;
            }
        }
        return (count + 1)/2;
    }
}