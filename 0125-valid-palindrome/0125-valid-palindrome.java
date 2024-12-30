class Solution {
    public boolean isPalindrome(String s) {
        if(s == null ||s.length()== 0) return true;
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if (Character.isAlphabetic(c)) {
                sb.append(c);
            }
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }
        String str = sb.toString().toLowerCase();
        if (str.length() == 0) return true;


        for(int i=0;i<=str.length()/2;i++){
            char st = str.charAt(i);
            char e = str.charAt(str.length()-1-i);

            if(st!=e) return false;
        }
        return true;
    }
}