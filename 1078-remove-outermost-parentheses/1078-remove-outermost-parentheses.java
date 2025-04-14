class Solution {
    public String removeOuterParentheses(String str) {
        Stack<Character> s = new Stack<>();
        int top = -1;
        String ans= "";

        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch=='('){
                s.push(ch);
                top++;
                if(top>0){
                    ans += s.peek(); 
                }
            }else{

                if(top>0){
                    ans+=')';
                   
                }
                 s.pop();
                    top--;

            }
        }
        return ans;
    }
}