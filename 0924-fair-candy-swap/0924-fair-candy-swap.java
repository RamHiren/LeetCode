class Solution {
    public int[] fairCandySwap(int[] a, int[] b) {
       int sa = 0;
       int sb = 0;
       Set<Integer> setb = new HashSet<>();

       for(int i : a){
        sa = sa+i;
       }
       for(int i : b){
        sb = sb +i;
        setb.add(i);
       }

        int d = (sb-sa)/2;
        for(int i:a){
            if(setb.contains(i+d)){
                return new int[] {i,i+d};
            }
        }
        return null;
    }
}