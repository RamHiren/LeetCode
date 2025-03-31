class Solution {
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