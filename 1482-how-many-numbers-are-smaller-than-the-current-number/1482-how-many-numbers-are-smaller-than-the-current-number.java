class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] a = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 0 ; j < nums.length ; j++){
                if(i==j){
                    continue;
                }
                if(nums[i]>nums[j]){
                    a[i]+=1;
                }
            }
        }
        return a;
    }
}