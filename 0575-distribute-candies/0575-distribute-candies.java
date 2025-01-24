class Solution {
    public int distributeCandies(int[] a) {
        HashSet<Integer> h = new HashSet<>();
        for(int i :a){
            h.add(i);
        }
        if(h.size()-1 >= a.length/2){
            return a.length/2;
        }else{
            return h.size();
        }
    }
}