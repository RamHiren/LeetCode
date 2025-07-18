class Solution {
    public int minSubArrayLen(int t, int[] a) {
        int s = Integer.MAX_VALUE;
        int sum=0;
        int i=0;
        int j=0;

        while(j<a.length){
            sum += a[j];
            j++;

           while(sum>=t){
                s = Math.min(s,j-i);
                sum -=a[i];
                i++;
           }
        }

        if( s==Integer.MAX_VALUE)return 0;
        return s;

    }
}