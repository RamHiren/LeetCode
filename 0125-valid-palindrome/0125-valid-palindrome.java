class Solution {
    public boolean isPalindrome(String s) {
        // String str = s.replaceAll("\\s","");
        String str1 = s.replaceAll("[^a-zA-Z0-9 ]", "");
         String str2 = str1.replaceAll("\\s","");
         String str3 = str2.toLowerCase();


        System.out.println(str2);
        int i=0;
        int j = str2.length()-1;
        while(i<j){
            if(str3.charAt(i) != str3.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}