class Solution {
    public int[] productExceptSelf(int[] a) {
        int zero=0;
        int b[] = new int[a.length];
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                zero++;
            }
        }
        if(zero>=2){
            return b;
        }

        int m =1;

        for(int i =0;i<a.length;i++){
            if(a[i]==0) continue;

            m *= a[i];
        }

        for(int i =0;i<a.length;i++){
            if(a[i]==0 ){
                b[i] =m;
            }else if(zero==1){
                b[i] = 0;
            }else{
                b[i]= m/a[i];
            }

        }
        return b;
    }
}