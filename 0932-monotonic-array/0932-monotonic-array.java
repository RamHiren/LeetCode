class Solution {
    public boolean isMonotonic(int[] a) {
        if(a.length<=2) return true;
        int x=1;

        boolean b = true;
        int in =1;
        while(x<a.length){
            if(a[x-1]<a[x]){
                in = 1;
                break;
            }else if(a[x-1]>a[x]){
                in = 0;
                break;
            }else{
                x++;
            }
        }
        for(int i = 1 ; i<a.length;i++){
            if(in == 1 && a[i-1]>a[i]){
              return false;
            }

             if(in == 0 && a[i-1]<a[i]){
               return false;
            }
        }
        return b;
    }
}