class Solution {
    public int findComplement(int num) {
        int a=num;
        int c=0;
        int ans =0;
        while(num>0){
            num= num/2;
            c++;
        }
        return a ^ (int)(Math.pow(2,c)-1);
    }
}