class Solution {
    public int[] twoSum(int[] a, int t) {
        int b[] = new int[2];

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if((a[i]+a[j])==t){
                    b[0]=i;
                    b[1]=j;
                }
            }
        }
        return b;
    }
}