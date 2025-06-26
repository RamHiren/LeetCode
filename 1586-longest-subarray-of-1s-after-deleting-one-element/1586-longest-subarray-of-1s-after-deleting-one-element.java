class Solution {
    public int longestSubarray(int[] a) {
        int max = Integer.MIN_VALUE;
        int len =0;
        int i=0;
        while(i<a.length && a[i]!=0){
            len++;
            i++;
        }
        i++;
        for(;i<a.length;i++){
            if(a[i]!=0){             
                len++;
            }else{
                max = Math.max(len,max);
                int j = i-len-1;
                while(a[j]!=0){
                    len--;
                    j++;
                }
                
            }
        }
        max = Math.max(len,max);

        if(max>=a.length)return max-1;

        return max;
        
    }
}