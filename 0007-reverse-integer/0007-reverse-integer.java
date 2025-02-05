class Solution {
    public int reverse(int x) {
        long y =0;
        while(x!=0){
            y = (long)(y*10)+(long)x%10;
            x /=10;
            if(y>=(long)Math.pow(2,31)-1){
            return 0;
        }
        }

            if(y<=(long)Math.pow(-2,31)){
                 return 0;
            }
        
            return (int)y;
        
    }
}