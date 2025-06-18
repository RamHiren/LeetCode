class Solution {
    public int[] searchRange(int[] a, int t) {
        int l = left(a,t);
        int r = right(a,t);

        return new int[]{l,r};

    }

    public int left(int[]a,int t){
        int ans = -1;
        int s = 0;
        int e = a.length-1;

        while(s<=e){
            int m = s + (e-s)/2;

            if(a[m]==t){
                ans = m;
                e = m-1;
            }
            else if(a[m]<t){
                s = m+1;
            }else{
                e = m-1;
            }
        }

        return ans;
    }

    public int right(int[]a,int t){
        int ans = -1;
        int s = 0;
        int e = a.length-1;

        while(s<=e){
            int m = s + (e-s)/2;

            if(a[m]==t){
                ans = m;
                s = m+1;
            }
            else if(a[m]<t){
                s = m+1;
            }else{
                e = m-1;
            }
        }

        return ans;
    }
}