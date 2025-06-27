class Solution {
    public int shipWithinDays(int[] a, int x) {
        int sum =0;
        int min=0;
        for(int i:a){
            sum+=i;
            min =Math.max(min,i);
        }

        int s = min;
        int e = sum;

        while(s<e){
            int m = (s + e)/2;

            if(helper(a,m)<=x){
                e=m;
            }else{
                s=m+1;
            }
        }

        return s;
        
    }

    public int helper(int[] a,int m){
        int d=1;
        int load=0;
        for(int i=0;i<a.length;i++){
            if(a[i]+load>m){
                d++;
                load =0;
            }
            load +=a[i]; 
        }
        return d;
    }
}