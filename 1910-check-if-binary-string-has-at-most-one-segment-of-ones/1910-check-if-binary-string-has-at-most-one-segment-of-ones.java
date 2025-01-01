class Solution {
    public boolean checkOnesSegment(String s) {
        int[] a = new int[s.length()];
         for (int i = 0; i < s.length(); i++) {
            a[i] = Character.getNumericValue(s.charAt(i));
        };

        int c=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                c=1;
            }
            if(c==1&&a[i]==1) return false;
        }


        return true;

    }
}