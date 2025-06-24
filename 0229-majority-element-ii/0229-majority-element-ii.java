class Solution {
    public List<Integer> majorityElement(int[] a) {
        HashMap<Integer,Integer> m = new HashMap<>();

        for(int i:a){
            if(!m.containsKey(i)){
                m.put(i,1);
            }else{
                m.put(i,m.get(i)+1);
            }
        }

        List<Integer> l =new ArrayList<>();

        for(int i:a){
            if(m.get(i)>a.length/3 && !l.contains(i)){
                l.add(i);
            }
        }

        return l;
    }
}