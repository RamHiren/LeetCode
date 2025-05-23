class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                st.push(c);
            }else{
                if(st.isEmpty() || st.peek() == ')'){
                    st.push(c);
                }else{
                    st.pop();
                }
            }
        }

        return st.size();
    }
}