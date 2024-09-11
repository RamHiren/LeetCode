class Solution {
    public int[] twoSum(int[] a, int t) {
        int s = 0;
        int e = a.length-1;
        int[] b = new int[2];
        while(s<=e){
            int sum = a[s] + a[e];
            if(sum==t){
                b[0]=s+1;
                b[1]=e+1;
                break;
            }
            else if(sum<t){
                s++;
            }
            else{
                e--;
            }
        }

        return b;
    }
}