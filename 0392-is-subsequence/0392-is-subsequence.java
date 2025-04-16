class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0;
        for(int i=0;i<t.length();i++){
            char ch =  t.charAt(i);
            if(j<s.length()){
                if(ch == s.charAt(j)){
                    j++;
                }
            }
        }
        

        return j==s.length();
    }
}