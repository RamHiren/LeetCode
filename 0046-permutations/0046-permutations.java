class Solution {
    public List<List<Integer>> permute(int[] a) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        helper(l,l1,a);

        return l;
    }

    public void helper(List<List<Integer>> l,List<Integer> l1,int[] a){
        if(l1.size()==a.length){
            l.add(new ArrayList<>(l1));
            return;
        }

        for(int n:a){
            if(l1.contains(n)){
                continue;
            }

            l1.add(n);
            helper(l,l1,a);
            l1.remove(l1.size()-1);
        }
    }
}