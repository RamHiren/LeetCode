class Solution {
    public List<List<Integer>> subsets(int[] a) {
        List<List<Integer>> l = new ArrayList<>();

        helper(l,a,new ArrayList<>(),0);

        return l;
    }

    public void helper(List<List<Integer>> l,int []a, List<Integer> t,int i){
        if(i==a.length){
            l.add(new ArrayList<>(t));
            return;
        }
        //pick
        t.add(a[i]);
        helper(l,a,t,i+1);
        // no pick
        t.remove(t.size()-1);
        helper(l,a,t,i+1);
    }


}