class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> l = new ArrayList<>();

        for(int i=0;i<n;i++){
            ArrayList<Integer> l1= new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    l1.add(1);
                }else{
                    List<Integer> x = l.get(i-1);
                    int a = x.get(j-1);
                    int b = x.get(j);
                    l1.add(a+b);
                }
            }

            l.add(l1);

        }

        return l;
    }
}