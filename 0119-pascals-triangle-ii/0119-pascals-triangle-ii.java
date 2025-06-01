class Solution {
    public List<Integer> getRow(int n) {
        if(n==0){
            List<Integer> l = new ArrayList<>();
            l.add(1);
            return l;
        }
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0;i<=n;i++){
            ArrayList<Integer> l1 = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    l1.add(1);
                }else{
                    List<Integer> x =l.get(i-1);
                    l1.add(x.get(j-1) + x.get(j));
                }
            }
            l.add(l1);
        }

        return l.get(n);
    }
}