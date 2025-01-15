class Solution {
    public int hammingDistance(int x, int y) {
        int a = x ^ y;
        int ans = 0;
       
        while (a > 0) {
            int c = a % 2;

            if (c == 1)
                ans++;
            a /= 2;
           
        }
      return ans;
    }
}