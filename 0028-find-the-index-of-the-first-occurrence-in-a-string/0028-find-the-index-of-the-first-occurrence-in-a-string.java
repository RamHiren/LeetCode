class Solution {
    public int strStr(String str, String p) {
        if(!str.contains(p)) return -1;

        return str.indexOf(p);
    }
}