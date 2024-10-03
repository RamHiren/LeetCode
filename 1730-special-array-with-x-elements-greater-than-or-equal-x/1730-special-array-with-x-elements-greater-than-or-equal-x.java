class Solution {
    public int specialArray(int[] a) {
        Arrays.sort(a);
        int i=0;
        while (i<=a.length) {
            int count = 0;
            for (int e : a) {
                
                if(e>=i)
                    count++;
            }
           
            if(count==i){
                return i;
            }
            i++;
        }
        return -1;
    } 
    
}