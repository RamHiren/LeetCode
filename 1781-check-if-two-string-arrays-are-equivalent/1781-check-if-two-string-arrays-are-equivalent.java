class Solution {
    public boolean arrayStringsAreEqual(String[] a1, String[] a2) {
        String s1="";
        String s2="";

        for(String i:a1){
            s1+=i;
        }
         for(String i:a2){
            s2+=i;
        }

        // System.out.println(s1);
        // System.out.println(s2);

        return s1.equals(s2);
    }
}