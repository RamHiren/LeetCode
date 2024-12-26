class Solution {
    public String defangIPaddr(String a) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='.'){
                str.append("[.]");
            }else{
               str.append(a.charAt(i));
            }
        }
        return str.toString();
    }
}