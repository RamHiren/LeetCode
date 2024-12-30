class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String [] str = s.split(" ");

        for(String i : str){
            StringBuilder t = new StringBuilder(i);
            t.reverse();
            sb.append(t+ " ");
        }
        return sb.toString().trim();
    }
}