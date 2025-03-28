class Solution {
    public String countAndSay(int n) {
         if (n == 1) return "1";

        String s = "1";

        for (int k = 1; k < n; k++) {
            StringBuilder sb = new StringBuilder();
            int i = 0;

            while (i < s.length()) {
                int count = 1;
                while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                    count++;
                    i++;
                }
                sb.append(count).append(s.charAt(i));
                i++;
            }

            s = sb.toString();
        }

        return s;
        
    }
}