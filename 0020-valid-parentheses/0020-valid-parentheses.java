class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 != 0)
        {
            return false;
        }
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<s.length() ; i++)
        {
            char curr = s.charAt(i);
            if(curr=='(' || curr=='[' || curr=='{')
            {
                st.push(curr);
            }
            else if(!st.empty()){
                char top = st.peek();
                if((curr==']' && top=='[') || (curr==')' && top=='(') || (curr=='}' && top=='{'))
                {
                    st.pop();
                }
                else{
                    st.push(curr);
                }
            }
            else{
                    st.push(curr);
                }
        }
        if(st.empty())
        {
            return true;
        }
        else{
            return false;
        }
    }
}