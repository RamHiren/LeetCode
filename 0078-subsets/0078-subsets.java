class Solution {
    public List<List<Integer>> subsets(int[] a) {
        List<List<Integer>> l = new ArrayList<>();

        l.add(new ArrayList<>());

        for(int i=0;i<a.length;i++){
            int s = l.size();
            for(int j=0;j<s;j++){
                List<Integer> t = new ArrayList<>(l.get(j));
                t.add(a[i]);
                l.add(t);
            }
        } 

        return l;
    }
}