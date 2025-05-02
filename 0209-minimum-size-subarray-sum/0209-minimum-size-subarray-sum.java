class Solution {
    public int minSubArrayLen(int t, int[] a) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j=0;
        int sum = 0;

        while(j<a.length){
            sum += a[j];
            j++;

            while(sum>=t){
                int x = j-i;

                min = Math.min(min,x);
                sum = sum - a[i];
                i++;
            }
        }


        if(min==Integer.MAX_VALUE) return 0;



        return min;
    }
}