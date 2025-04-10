class Solution {
    public int removeDuplicates(int[] a) {
        ArrayList<Integer> l = new ArrayList<>();

        for(int i : a){
            if(!l.contains(i)){
                l.add(i);
            }
        }

        for(int i=0;i<l.size();i++){
            a[i] = l.get(i);
        }

        return l.size();
    }
}