class Solution {
    public int maximumLength(int[] a) {
        int even =0;
        int odd =0;
        int alt1 =0;
        int alt2 =0;


        for(int i:a){
            if(i%2==0){
                even++;
            }else{
                odd++;
            }
        }
        int f=0;
        for(int i:a){
            if(i%2==0 && f==0){
                f=1;
                alt1++;
            }
            if(i%2==1 && f==1){
                f=0;
                alt1++;
            }
        }

          f=0;
        for(int i:a){
            if(i%2==1 && f==0){
                f=1;
                alt2++;
            }
            if(i%2==0 && f==1){
                f=0;
                alt2++;
            }
        }

        int max = Math.max(odd,even);
        max=Math.max(alt1,max);
        max=Math.max(alt2,max);
        return max;
    }
}