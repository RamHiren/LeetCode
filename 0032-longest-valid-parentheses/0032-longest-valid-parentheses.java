class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                st.push(i);
            }else{
                if(!st.isEmpty() && s.charAt(st.peek()) == '('){
                    st.pop();
                } else {
                    st.push(i);
                }
            }
        }

        ArrayList<Integer> l = new ArrayList<>();
        l.add(-1);
        for (int i = 0; i < st.size(); i++) {
            l.add(st.get(i));
        }
        l.add(s.length());



        int max = Integer.MIN_VALUE;

        for (int i = 1; i < l.size(); i++) {
            max = Math.max(max , (l.get(i) - l.get(i-1)-1));
        }
        return max;
    
    }
}