class Solution {
    public int rob(int[] a) {
       if (a.length < 2) {
            return a[0];
        }

       int[] b = new int[a.length];

       b[0] = a[0];
       b[1] = Math.max(a[0], a[1]);

       for (int i = 2; i < b.length; i++) {
            b[i] = Math.max(b[i-2]+a[i], b[i-1]);
       }

       return b[b.length - 1]; 
    }
}