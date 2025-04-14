class Solution {
    public String removeDuplicates(String str) {
        Stack<Character> s = new Stack<>();
        int top= -1;


        for(int i=0;i<str.length();i++){
            if(top==(-1) || s.peek() != str.charAt(i)){
                s.push(str.charAt(i));
                top++;
            }else{
                s.pop();
                top--;
            }
        }

        String ans ="";

        // if(s.size() != 0){
        //     for(int i=0;i<=s.size();i++){
        //         ans += s.pop();
        //     }
        // }else{
        //     return "";
        // }

       while (!s.isEmpty()) {
            ans += s.pop();
        }
        
        System.out.println(ans);

        String a="";
        for(int i=ans.length()-1;i>=0;i--){
            a += ans.charAt(i);
        }

        return a;
    }
}