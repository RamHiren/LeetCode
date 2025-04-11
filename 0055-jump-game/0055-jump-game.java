class Solution {
    public boolean canJump(int[] a) {
        int finalPos = a.length-1;

        for(int i =a.length-2;i>=0;i--){
            if(a[i]+i >= finalPos){
                finalPos = i;
            }
        }

        return finalPos==0;
    }
}