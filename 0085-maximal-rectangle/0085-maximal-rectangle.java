class Solution {
    public int maximalRectangle(char[][] a) {
        if(a.length == 0){
            return 0;
        }
        int h[] = new int[a[0].length];
        int max =0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                int v = a[i][j] - '0';
                if(v==0){
                    h[j]=0;
                }else{
                    h[j] += v;
                }
            }
            max = Math.max(max,largestRectangleArea(h));
        }
        return max;
    }


    public int largestRectangleArea(int[] a) {
        int [] ns = nextSmaller(a);
        int [] ps = prevSmaller(a);
        int ans = Integer.MIN_VALUE;

        for(int i =0;i<a.length;i++){
            int w = ns[i]-ps[i]-1;
            ans = Math.max(ans,w*a[i]);
        }
        return ans;
    }
   public int[] nextSmaller(int []a){
        int [] r = new int[a.length];
        Stack<Integer> s = new Stack<>();
        for(int i = a.length-1;i>=0;i--){
            while(!s.isEmpty() && a[s.peek()]>=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                r[i] = a.length;
            }else{
                r[i] = s.peek();
            }
            s.push(i);
        }
        return r;
    }

    public int[] prevSmaller(int []a){
        int [] r = new int[a.length];

        Stack<Integer> s = new Stack<>();

        for(int i = 0;i<a.length;i++){
            while(!s.isEmpty() && a[s.peek()]>=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                r[i] = -1;
            }else{
                r[i] = s.peek();
            }

            s.push(i);
        }
        return r;
    }
}