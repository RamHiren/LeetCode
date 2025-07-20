class Solution {
    public List<List<Integer>> subsets(int[] a) {
        List<List<Integer>> l = new ArrayList<>();

        helper(l,a,new ArrayList<>(),0);

        return l;
    }

    public void helper(List<List<Integer>> l,int []a, List<Integer> t,int i){
        l.add(new ArrayList<>(t));

        for(int j=i;j<a.length;j++){
            t.add(a[j]);

            helper(l,a,t,j+1);

            t.remove(t.size()-1);

        }
    }


}