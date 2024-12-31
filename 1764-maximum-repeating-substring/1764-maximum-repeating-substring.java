class Solution {
    public int maxRepeating(String str, String p) {
        int c = 0;
        String newP = p;

        while (str.contains(newP)) {
            c++; 
            newP += p; 
        }

        return c;
    }
}
