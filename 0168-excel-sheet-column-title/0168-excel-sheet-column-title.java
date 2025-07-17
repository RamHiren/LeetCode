class Solution {
    public String convertToTitle(int c) {
        StringBuilder ans = new StringBuilder();

        while (c > 0){
            c--;
            int r = (c % 26);
            ans.append((char)(r + 'A'));
            c = (c) / 26;

        }

        return ans.reverse().toString();
    }
}