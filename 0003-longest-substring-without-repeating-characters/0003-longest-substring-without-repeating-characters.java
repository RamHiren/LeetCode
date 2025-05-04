class Solution {
    public int lengthOfLongestSubstring(String s) {
        String a="";
        int max = 0;
        int c=0;

        for(int i =0;i<s.length();i++){

            char ch = s.charAt(i);

            
            int  j = a.indexOf(ch);

            if(j != -1){
                max=Math.max(max,a.length());
                a="";
                // a += ch;

                c++;
                i = c;
                i--;

            }else{
                a += ch;
                
            }
        }

        max=Math.max(max,a.length());

        return max;
    }
}