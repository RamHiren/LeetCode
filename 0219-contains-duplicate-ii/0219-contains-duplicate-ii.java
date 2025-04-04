class Solution {
    public boolean containsNearbyDuplicate(int[] a, int k) {
        Map<Integer,Integer> h = new HashMap<>();

        for(int i =0;i<a.length;i++){
            if(h.containsKey(a[i]) && i- h.get(a[i]) <= k){
                return true;
            }
            h.put(a[i],i);
        }

        return false;
    }
}