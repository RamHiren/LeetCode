class Solution {
    public int singleNonDuplicate(int[] a) {

        if (a.length <= 1)
            return a[0];
        if (a[0] != a[1])
            return a[0];
        if (a[a.length - 1] != a[a.length - 2])
            return a[a.length - 1];

        int s = 1;
        int e = a.length - 2;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (a[m] != a[m + 1] && a[m] != a[m - 1])
                return a[m];
            if ((m % 2 == 1 && a[m - 1] == a[m]) || (m % 2 == 0 && a[m] == a[m + 1]))
                s = m + 1;
            else
                e = m - 1;
        }
        return -1;
    }
}