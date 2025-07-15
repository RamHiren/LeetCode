class Solution {
    public int helper(int a[]){
        if(a.length==1){
            return a[0];
        }
        if(a.length==2){
            return Math.max(a[0],a[1]);
        }
        int t[] = new int[a.length+1];

        for(int i=0;i<a.length;i++){
            if(i<2){
                t[i+1] = a[i];
            }else{
                int m = Math.max(t[i-1],t[i-2])+a[i];
                t[i+1]=m;
            }
        }
        int ans =0;
        for(int i:t){
            ans = Math.max(ans,i);
        }
        return ans;
    }
    public int rob(int[] a) {
        if(a.length==1)return a[0];
        if(a.length==2) return Math.max(a[0],a[1]);
        int a1[] = new int[a.length-1];
        int a2[] = new int[a.length-1];
        int x=0;int y=0;
        for(int i=0;i<a.length;i++){
            if(i==0){
                a2[y] = a[i];
                y++;
            }else if(i==a.length-1){
                a1[x]=a[i];
                x++;
            }else{
                a1[x] =a[i];
                a2[y] = a[i];
                y++;
                x++;
            }
        }

        return Math.max(helper(a1),helper(a2));
    }
}