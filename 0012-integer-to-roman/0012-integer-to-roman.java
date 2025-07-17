class Solution {
    public String intToRoman(int n) {
        String s[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int c[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String str ="";

        for(int i=0;i<c.length;i++){
            while(n>=c[i]){
                str += s[i];
                n=n-c[i];
            }
            if(n<=0)break;
        }
        return str;
    }
}