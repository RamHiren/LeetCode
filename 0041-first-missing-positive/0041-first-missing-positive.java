class Solution {
    public int firstMissingPositive(int[] a) {
       int min=1;
        int f=0;
        
        Set<Integer> s  = new HashSet<>();
         for (int i = 0; i < a.length; i++) {
             if(a[i]<=0){
                 continue;
             }
             s.add(a[i]);
         }
         List<Integer> l = new ArrayList<>(s);
         Collections.sort(l);
         System.out.println(l);
         for (int i = 1; i <= l.size(); i++) {
           
             if(i!=l.get(i-1)){
                 min=i;
                 f++;
                 break;
             }
         }
        
         if(f==0){
             min=l.size()+1;
         }

         return min;




    }
}