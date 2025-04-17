class Solution {
    public int minSubArrayLen(int t, int[] a) {
        int min = Integer.MAX_VALUE;
        int sum=0;
        int i=0;
        int j=0;

        while(i<a.length){
            sum += a[i];
            i++;

            while(sum>=t){
                int x =  i-j;

                min = Math.min(x,min);
                sum -= a[j];
                j++;
            }
        }


        if(min==Integer.MAX_VALUE) return 0;

        return min;
    }
}