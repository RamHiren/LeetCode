class Solution {
    public int longestConsecutive(int[] a) {
        Arrays.sort(a);
        if(a.length==0) return 0;
        if(a.length==1)return 1;
        int max=0;
        int t=1;
        for(int i=1;i<a.length;i++){
            if(a[i-1]==a[i])continue;
            if(a[i-1]+1==a[i]){
                t++;
            }else{
                max = Math.max(t,max);
                t=1;
            }
        }
        max = Math.max(t,max);

        return max;
    }
}