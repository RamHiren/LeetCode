class Solution {
    public boolean isGoodArray(int[] a) {
        int x = a[0];

        
        for (int e : a) {
            x = gcd(x, e);
        }

        
        return x == 1;
    }

    
    private int gcd(int x, int e) {
        if (e == 0) {
            return x;
        }
        return gcd(e, x % e);
    }
}
