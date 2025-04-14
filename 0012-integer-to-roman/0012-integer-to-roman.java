class Solution {
    public  String intToRoman(int n) {
        String s ="";
        int [] v = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String [] r = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        for(int i =0;i<v.length;i++){
            while(n >= v[i]){
                s += r[i];
                n -= v[i];
            }
        }
        
        return s;
    }
}