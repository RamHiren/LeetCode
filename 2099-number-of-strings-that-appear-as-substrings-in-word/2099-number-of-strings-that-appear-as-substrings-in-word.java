class Solution {
    public int numOfStrings(String[] arr, String s) {
        int c=0;
        for(String i : arr){
            if(s.contains(i)) c++;
        }
        return c;
    }
}