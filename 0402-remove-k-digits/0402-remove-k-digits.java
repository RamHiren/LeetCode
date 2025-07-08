class Solution {
    public String removeKdigits(String a, int k) {
        Stack<Character> s = new Stack<>();

        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            while(!s.isEmpty() && s.peek()>ch && k>0){
                s.pop();
                k--;
            }
            s.push(ch);
        }

        while(!s.isEmpty() && k-->0){
            s.pop();
        }

        System.out.println("Stack "+s);

        StringBuilder ans = new StringBuilder();
        
        while(!s.isEmpty()){
            ans.append(s.pop());
        }
        ans.reverse();
        System.out.println("String "+ans);

        int f=0;
        int j=0;

        if(ans.length()==0) return "0";

        while(f==0  && j<ans.length()){
            if(ans.charAt(j)!='0'){
                f++;
            }else{
                j++;
            }
        }
        if(j==ans.length() && f==0) return "0";
        String ans1="";
        ans1 = ans.substring(j);


        return ans1;
    }
}