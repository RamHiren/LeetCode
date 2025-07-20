class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(Character.isAlphabetic(ch)){
                sb.append(ch);
            }
            if(Character.isDigit(ch)){
                sb.append(ch);
            }
        } 

        String str =sb.toString().toLowerCase();

        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1))return false;
        }

        return true;
    }
}