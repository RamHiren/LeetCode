class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1 || n==3) return true;
        if(n<3) return false;
        while(n>=3){
            if(n%3==0){
                n/=3;
                if(n==3) return true;
            }else{
                return false;
            }
        }
        return false;
    }
}