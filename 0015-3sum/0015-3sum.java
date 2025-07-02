class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        Arrays.sort(a);
        Set<List<Integer>> s = new HashSet<>();

        for(int k=0;k<a.length;k++){
            int i=k+1;
            int j=a.length-1;

            while(i<j){
                int sum=a[i]+a[j]+a[k];

                if(sum==0){
                    List<Integer> l = new ArrayList<>();
                    l.add(a[i]);
                    l.add(a[j]);
                    l.add(a[k]);
                    s.add(l);
                    while(i<j && a[i] == a[i+1]){
                        i++;
                    }
                    while(i<j && a[j] == a[j-1]){
                        j--;
                    }
                    i++;
                    j--;
                }else if(sum>0){
                    j--;
                }else{
                    i++;
                }
            }

        }
        List<List<Integer>> l = new ArrayList<>(s);
        return l;
    }
}