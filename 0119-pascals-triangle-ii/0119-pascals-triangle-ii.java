class Solution {
    public List<Integer> getRow(int n) {
        List<List<Integer>> l = new ArrayList<>();
        // if(n==0){
        //     return new ArrayList<>(1);
        // }
        for(int i=0;i<=n;i++){
            List<Integer> l1 = new ArrayList<>();

            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    l1.add(1);
                }else{
                    List<Integer> t = l.get(i-1);

                    int a = t.get(j-1);
                    int b = t.get(j);
                    l1.add(a+b);
                }
            } 
            l.add(l1);
        }
        return l.get(n);
    }
}