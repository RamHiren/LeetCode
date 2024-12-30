class Solution {
    public String convertToTitle(int c) {
        StringBuilder ans = new StringBuilder();

        while (c > 0) {
            c--;
            ans.append((char) (((c) % 26) + 'A'));
            c = (c) / 26;
        }

        return ans.reverse().toString();
    }
}