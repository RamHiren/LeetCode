class Solution {
    public int minEatingSpeed(int[] a, int h) {
        
        int s =1;
        int e = Integer.MIN_VALUE;
        for(int i:a) e = Math.max(e,i);

        while(s<e){
            int m = s + (e-s)/2;

            if(check(a,m,h)){
                e = m;
            }else{
                s = m+1;
            }

        }

            return s;

    }

    boolean check(int[] a,int m,int h){
        int t =0;
        for(int i=0;i<a.length;i++){
            t += Math.ceil((double)(a[i])/(double)(m));
        }
        return t<=h;
    }
}