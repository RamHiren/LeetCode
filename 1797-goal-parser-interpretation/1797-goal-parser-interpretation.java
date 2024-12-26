class Solution {
    public String interpret(String s) {
        StringBuilder a=new StringBuilder();
        if(s.charAt(0)=='G') a.append("G");
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == 'G') a.append("G");
            if(s.charAt(i-1)=='(' &&s.charAt(i)==')') a.append("o");
            if(s.charAt(i-1)=='(' && s.charAt(i)=='a') a.append("a");
            if(s.charAt(i-1)=='l' && s.charAt(i)==')') a.append("l");
        }

        return a.toString();
    }
}