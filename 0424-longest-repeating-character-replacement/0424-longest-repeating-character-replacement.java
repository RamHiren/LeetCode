class Solution {
    public int characterReplacement(String s, int k) {
        int f[] = new int[26];
        int l=0;
        int mf = 0;
        int max = 0;

        for(int i=0;i<s.length();i++){
            f[s.charAt(i)-'A']++;

            mf = Math.max(mf, f[s.charAt(i)-'A']);

            int wl = i-l+1;

            if(wl - mf > k){
                f[s.charAt(l)-'A']--;
                l++;
            } 

            wl = i-l+1;
            max = Math.max(max,wl);
        }

        return max;
    }
}