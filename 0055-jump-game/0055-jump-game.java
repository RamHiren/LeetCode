class Solution {
    public boolean canJump(int[] a){
        
        if(a[0]>=a.length-1){
            return true;
        }
       if(a[0]==0){
            return false;
        }

       for(int i =0;i<a.length;i++){
        if(a[i] == 0){
            int ind =i;
            int f = 0;

            for(int j=0;j<ind;j++){
                if(a[j]+j >=a.length-1) return true;

                if(a[j]+j>ind){
                    f=1;
                    // break;
                }
            }


            if(f==0) return false;
        }
       }
       return true;
    }
}