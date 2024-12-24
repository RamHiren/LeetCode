class Solution {
    public List<List<Integer>> threeSum(int[] a) {
       Set<List<Integer>> h = new HashSet<>();
        Arrays.sort(a);

        for (int i = 0; i < a.length-2; i++) {
            int p = i + 1;
            int q = a.length - 1;

            while (p < q) {
                int sum =a[i] + a[p] + a[q];
                if (sum == 0) {
                    h.add(Arrays.asList(a[i],a[p],a[q]));
                    p++;
                    q--;
                } else if (sum > 0) {
                    q--;
                } else if(sum < 0) {
                    p++;
                }

            }

        }
        return new ArrayList<>(h);
    }
}