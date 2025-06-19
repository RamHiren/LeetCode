class Solution {
    public int longestConsecutive(int[] a) {
        if(a.length==0)return 0;
        Arrays.sort(a);
        int c =1;
        int max=0;
        for(int i=1;i<a.length;i++){
            if(a[i]-a[i-1]==0) continue;
            if(a[i]-a[i-1]==1){
                c++;
            }else{
                max = Math.max(max,c);
                c=1;
            }
        }
        max = Math.max(max,c);
        return max;
    }
}