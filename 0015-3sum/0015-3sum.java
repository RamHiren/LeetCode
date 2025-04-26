class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        Set<List<Integer>> h = new HashSet<>();
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            int s =i+1;
            int e = a.length-1;

            while(s<e){
                if(a[i]+a[s]+a[e]==0){
                  h.add(Arrays.asList(a[i],a[s],a[e]));
                    s++;
                    e--;
                }
                else if(a[i]+a[e]+a[s]<0){
                    s++;
                }else{
                    e--;
                }
            }
        }

        return new ArrayList<>(h);
    }
}