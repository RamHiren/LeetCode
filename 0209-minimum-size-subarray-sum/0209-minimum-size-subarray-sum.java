class Solution {
    public int minSubArrayLen(int t, int[] a) {
        int sum = 0;
        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;

        while (j < a.length) {
            sum += a[j];
            j++;

            while(sum>=t){
                int size = j-i;

                min = Math.min(min,size);
                sum -= a[i];
                i++;
            }
        }

        if(min==Integer.MAX_VALUE) return 0;
        return min;

    }
}