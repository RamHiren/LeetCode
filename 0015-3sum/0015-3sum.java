class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        Arrays.sort(a);
        Set<List<Integer>> l = new HashSet<>();

        for(int k=0;k<a.length;k++){
            int i=k+1;
            int j=a.length-1;

            while(i<j){
                if(a[i]+a[j]+a[k]==0){
                    List<Integer> l1 = new ArrayList<>();
                    l1.add(a[k]);l1.add(a[i]);l1.add(a[j]);
                    l.add(l1);
                    i++;j--;
                }
                else if(a[i]+a[j]+a[k]>0){
                    j--;
                }else{
                    i++;
                }
            }
        }

        return new ArrayList<>(l);

    }
}