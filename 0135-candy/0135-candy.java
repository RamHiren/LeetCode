class Solution {
    public int candy(int[] a) {
        int r[]  = new int[a.length];
        int l[] = new int[a.length];
        l[0]=1;
        r[r.length-1]=1;

        for(int i =1;i<a.length;i++){
            if(a[i]>a[i-1]){
                l[i]=l[i-1]+1;
            }else{
                l[i]=1;
            }
        }

        for(int i=a.length-2;i>=0;i--){
            if(a[i]>a[i+1]){
                r[i]=r[i+1]+1;
            }else{
                r[i]=1;
            }
        }
        int max =0;
        for(int i=0;i<a.length;i++){
            max = max + Math.max(r[i],l[i]);
        }

        return max;
    }
}