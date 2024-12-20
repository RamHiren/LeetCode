class Solution {
    public int firstMissingPositive(int[] a) {
       int i = 0;
        while (i < a.length) {
            int correct = a[i] - 1;
            if (a[i] > 0 && a[i] <= a.length && a[i] != a[correct]) {
               int t = a[i];
               a[i] = a[correct];
               a[correct]=t;
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < a.length; index++) {
            if (a[index] != index + 1) {
                return index + 1;
            }
        }

        // case 2
        return a.length + 1;
    }
}