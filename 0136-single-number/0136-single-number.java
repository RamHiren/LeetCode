class Solution {
    public int singleNumber(int[] a) {
        int u=0;
        for(int i :a){
            u ^=i;
        }
        return u;
    }
}