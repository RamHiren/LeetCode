class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int mul = 1;

        while (n > 0) {
            int a = n % 10;
            sum += a;
            mul *= a;
            n /= 10;
        }
        return mul - sum;
    }
}