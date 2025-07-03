class Solution {
    public String removeKdigits(String a, int k) {
        Stack<Character> s = new Stack<>();

        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);

            while(!s.isEmpty() && k>0 && ch<s.peek()){
                s.pop();
                k--;
            }
            s.push(ch);
        }

        while(!s.isEmpty() && k>0){
            s.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();

        while(!s.isEmpty()){
            sb.append(s.pop());
        }

        sb = sb.reverse();

        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }

        if(sb.length()==0)return "0";

        return sb.toString();
    }
}