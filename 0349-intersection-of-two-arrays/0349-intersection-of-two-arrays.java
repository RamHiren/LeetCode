class Solution {
    public int[] intersection(int[] a, int[] b) {
        Set<Integer> s1 = new HashSet<>();
            Set<Integer> s2 = new HashSet<>();
            for (int i : a) {
                s1.add(i);
            }
            for (int i : b) {
                s2.add(i);
            }

            s1.retainAll(s2);
            int[] c = new int[s1.size()];
            int index = 0;
            for (Integer i : s1) {
                c[index++] = i;
            }
            return c;
    }
}