class Solution {
    public int maxSubArray(int[] a) {
         int sum =0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            sum = sum + a[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}