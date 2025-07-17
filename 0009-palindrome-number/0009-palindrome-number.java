class Solution {
    public boolean isPalindrome(int x) {
        int x1 =x;
        int a =0;

        while(x>0){
            int r = x%10;
            a= a*10 + r;
            x /= 10;
        }
        return a==x1;
    }
}