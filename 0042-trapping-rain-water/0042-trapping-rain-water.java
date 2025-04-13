class Solution {
    public int trap(int[] a) {
        int r[] = new int[a.length];
        int l[] = new int[a.length];
        int max = a[0];
        for(int i =0;i<a.length;i++){
            if(a[i]>max){
                r[i]=a[i];
                max=a[i];
            }else{
                r[i]=max;
            }
        }
        max=a[a.length-1];
        for(int i=a.length-1;i>=0;i--){
            if(a[i]>max){
                l[i]=a[i];
                max=a[i];
            }else{
                l[i]=max;
            }
        }
        int ans=0;
        for(int i =0;i<a.length;i++){
            ans += Math.min(l[i],r[i])-a[i];
        }


        return ans;
    }
}