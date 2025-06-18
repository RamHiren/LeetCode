class Solution {
    public int findKthLargest(int[] a, int k) {
        Arrays.sort(a);
        // ArrayList<Integer> h = new ArrayList<>();


        // for(int i=a.length-1;i>=0;i--){
        //     if(!h.contains(a[i]) && h.size() == k-1) return a[i];
        //     h.add(a[i]);
        // }

        return a[a.length-k];
    }
}