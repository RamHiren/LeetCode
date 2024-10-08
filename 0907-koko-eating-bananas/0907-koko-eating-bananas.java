class Solution {
    public int minEatingSpeed(int[] a, int h) {
         Arrays.sort(a);
        int s = 1, e = a[a.length - 1];
        // System.out.println(e);
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (check(m, a) <= h) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return s;
    }

    static long check(int m, int[] a) {
        long total = 0;
        for (int i = 0; i < a.length; i++) {
            total = total + (long)Math.ceil((double)a[i]/m);
        }
        return total;
    }
}