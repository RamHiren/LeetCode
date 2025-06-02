class Solution {
    public int singleNumber(int[] a) {
        HashMap<Integer,Integer> m = new HashMap<>();

        for(int i=0;i<a.length;i++){
            if(m.containsKey(a[i])){
                m.put(a[i],m.get(a[i])+1);
            }else{
                m.put(a[i],1);
            }
        }

        for(int i=0;i<a.length;i++){
            if(m.get(a[i])==1){
                return a[i];
            }
        }

        return -1;
    }
}