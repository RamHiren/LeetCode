class Solution {
    public int matchPlayersAndTrainers(int[] g, int[] s) {
         Arrays.sort(g);
        Arrays.sort(s);
        int j=0,i=0;
        int count=0;

        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                count++;
                j++;
                i++;
            }else{
                j++;
            }
        }
        return count;
    }
}