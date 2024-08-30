class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] a = new int[(nums.length)*2];
        for(int i =0;i<(nums.length)*2;i++){
            int j = i%(nums.length);
            a[i]=nums[j];
        } 
        return a;
    }
}