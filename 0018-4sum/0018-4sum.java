class Solution {
    public List<List<Integer>> fourSum(int[] n, int t) {
         List <List<Integer>> l1 = new ArrayList<>();
Arrays.sort(n);
        for(int i = 0; i < n.length; i++){
            for(int j = i + 1; j < n.length; j++){
               int p = j+1;
               int q = n.length-1;
               while (p<q) {
                 long sum = (long)n[i] + (long)n[j] + (long)n[p] + (long)n[q];

                  if(sum==t){
                    List<Integer> l2 = new ArrayList<>();
                    l2.add(n[i]);
                    l2.add(n[j]);
                    l2.add(n[p]);
                    l2.add(n[q]);
                    if(!l1.contains(l2)){
                        l1.add(l2);

                    }
                    p++;
                    q--;
                  }
                  else if(sum>t){
                    q--;
                  }else if(sum<t){
                    p++;
                  }

               }
            }
        }
        return l1;
    }
}