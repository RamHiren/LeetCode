class Solution {
    public int[] productExceptSelf(int[] a) {
        int[] b = new int[a.length];
        int f=1;
        int c =0;
        int e =0;
        for (int i = 0; i < b.length; i++) {
            if(a[i]!=0){
                e++;
            }
        }
        if(e==0||e<=a.length-2){
            return b;
        }
        for (int i = 0; i < b.length; i++) {
            if(a[i]==0){
                c++;
            }else{
                f=f*a[i];
            }
            
        }

        for (int i = 0; i < b.length; i++) {
            if(a[i]==0){
                b[i]=f;
                continue;
            }
            
            if(c>0){
                b[i]=0;
                continue;
            }
            b[i] = f/a[i];
        }
        System.out.println(f);

        return b;
    }
}