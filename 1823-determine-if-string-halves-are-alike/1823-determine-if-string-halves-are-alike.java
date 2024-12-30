class Solution {
    public boolean halvesAreAlike(String s) {
        // int half = s.length()/2;
        // char[] a = new char[half];
        // char[] b = new char[half];

        // for(int i=0;i<half;i++){
        //     a[i]=
        // }

        int av = 0;
        int bv =0;

        for(int i=0; i< s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                if(i<s.length()/2) {
                    av++;
                }else{
                    bv++;
                }

            }
        }

        return av==bv;
        
    }
}