class Solution {
    public boolean hasAlternatingBits(int n) {
        int l = n%2;
        n = n/2;
        while(n>0){
            if(l == n%2) return false;
            l = n%2;
            n/=2;
        }
        return true;
    }
}