class Solution {
    public int minSwaps(String s) {
        // Stack<Character> st = new Stack<>();

        // for(int i =0;i<s.length();i++){
        //     char c = s.charAt(i);

        //     if(c ==  '['){
        //         st.push(c);
        //     }else{
        //         if(st.isEmpty()||st.peek() == ']'){
        //             st.push(c);
        //         }else{
        //             st.pop();
        //         }
        //     }
        // }
        // int open = st.size()/2;
        // return (open+1)/2;


        int open=0,close=0;

        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c== '['){
                open++;
            }else{
                if(open <= 0){
                    close++;
                }else{
                    open--;
                }
            }
        }

        return (open + 1)/2;
    }
}