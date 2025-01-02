class Solution {
    public String mergeAlternately(String a, String b) {
         StringBuilder sb = new StringBuilder();
        int i=0;
        int j=0;
        while(i<a.length() || j<b.length()){
            if(i<a.length()){
                sb.append(a.charAt(i++));
            }
            if(j<b.length()){
                sb.append(b.charAt(j++));
            }
        }

        return sb.toString();
    }
}