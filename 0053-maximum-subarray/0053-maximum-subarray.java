class Solution {
    public int maxSubArray(int[] a) {
        int sum =0;
        int ans = Integer.MIN_VALUE;

        for(int i : a){
            sum += i;
            if(sum>ans)ans = sum;
            if(sum<0) sum =0;
        }

        return ans;
    }
}