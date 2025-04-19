class Solution {
    public int sumOfUnique(int[] a) {
       HashMap<Integer,Integer> m = new HashMap<>();

       for(int i: a){
        if(m.containsKey(i)){
            m.put(i,m.get(i)+1);
        }else{
            m.put(i,1);
        }
       }

       int sum = 0;

       for(int i:a){
        if(m.get(i)==1){
            sum += i;
        }
       }

       return sum;

    }
}