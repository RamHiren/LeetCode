class Solution {
    public int hammingWeight(int n) {
        int b =0;
        int c=0;
        while(n>0){
            b = n%2;
            n/=2;
            if(b==1) c++;
        }
        return c;
    }
}