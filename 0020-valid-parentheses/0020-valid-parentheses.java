class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 != 0){
            return false;
        }
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(c == '(' ||c == '{' ||c == '['){
                st.push(c);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char t = st.peek();

                if(c== ')' && t != '('){
                    return false;
                }
                else if(c== '}' && t != '{'){
                    return false;
                }
                else if(c== ']' && t != '['){
                    return false;
                }else{
                    st.pop();
                }
            }
        }

        return (st.size()==0);
    }
}