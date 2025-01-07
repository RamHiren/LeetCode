class Solution {
    public void reverseString(char[] s) {
        char[] a = new char[s.length];

        for(int i =0;i<a.length;i++){
            a[a.length-1-i]=s[i];
        }
         for(int i =0;i<a.length;i++){
            s[i]=a[i];
        }
    }
}