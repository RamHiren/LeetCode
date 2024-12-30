class Solution {
    public boolean validPalindrome(String s) {
        if (s == null || s.length() == 0) return false;

        for (int i = 0; i < s.length() / 2; i++) {
            int st = i;
            int ed = s.length() - 1 - i;

            if (s.charAt(st) != s.charAt(ed)) {
                return isPalindrome(s, st + 1, ed) || isPalindrome(s, st, ed - 1);
            }
        }

        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
