class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1 || n==4 ) return true;
        if(n<4) return false;
        while(n>4){
            if(n%4==0){
                n/=4;
                if(n==4) return true;
            }else{
                return false;
            }
        }
        return false;
    }
}