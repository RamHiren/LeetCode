class Solution {
    public boolean canJump(int[] a) {
        if(a[0]>=a.length-1){
            return true;
        }
       if(a[0]==0){
            return false;
        }
        
        
        for (int i = 0; i < a.length-1; i++) {
            if(a[i]>=a.length-1){
                return true;
            }
            if(a[i]==0){
                boolean f = false;
                for (int j = 0; j <= i-1; j++) {
                    if((j+a[j])>i){
                        f = true;
                        break;
                    }
                }
                if(f==false){
                    return false;
                }
            }
        }
        return true;
    }
}