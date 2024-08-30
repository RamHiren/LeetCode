class Solution {
    public boolean checkIfPangram(String sentence) {
        int[]a = new int[26];
        boolean b=true;
        for(int i = 0; i<sentence.length();i++){
            int t = sentence.charAt(i) - 97 ;
            a[t]=1;
        }
        for(int i= 0; i<a.length;i++){
            if(a[i]==0){
                b=false;
            }
        }
        return b;
    }
}