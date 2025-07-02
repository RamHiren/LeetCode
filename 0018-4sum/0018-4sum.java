class Solution {
    public List<List<Integer>> fourSum(int[] a, int t) {
        Arrays.sort(a);
       HashSet<List<Integer>> s = new HashSet<>();

       for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                int x=j+1;
                int y=a.length-1;

                while(x<y){
                    long sum = (long)a[i]+(long)a[j]+(long)a[x]+(long)a[y];

                    if(sum==(long)t){
                       List<Integer> l = new ArrayList<>();
                       l.add(a[i]);l.add(a[j]);l.add(a[x]);l.add(a[y]); 
                       s.add(l);
                       x++;y--;
                    }else if(sum>t){
                        y--;
                    }else{
                        x++;
                    }
                }
            }
       }
    List<List<Integer>> l = new ArrayList<>(s);
        return l;
    }
}