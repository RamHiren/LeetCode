class Solution {
    public int romanToInt(String s) {
        HashMap<String,Integer> m = new HashMap<>();
        int ans =0;
        m.put("I",1);
        m.put("IV",4);
        m.put("V",5);
        m.put("IX",9);
        m.put("X",10);
        m.put("XL",40);
        m.put("L",50);
        m.put("XC",90);
        m.put("C",100);
        m.put("CD",400);
        m.put("D",500);
        m.put("CM",900);
        m.put("M",1000);

        for(int i=0;i<s.length();i++){
            if(i==s.length()-1){
                ans += m.get(s.charAt(i)+"");
            }else{

                String t= ""+s.charAt(i)+s.charAt(i+1);
                if(m.containsKey(t)){
                    ans = ans + m.get(t);
                    i++;
                }else{
                    String t1 = ""+ s.charAt(i);
                    // System.out.println(t1);
                    // System.out.println(m.get("I"));

                    ans = ans+ m.get(t1);
                }
            }
        }



        return ans;
    }

    // public int romanToInt(String s) {
    //    String str [] = {"I","IV","V","IX","X","L","XC","C","D","CM","M"};
    //    int a [] = {1,4,5,9,10,50,90,100,500,900,1000};
    //    int ans=0;
       

    //    for(int i=0;i<s.length();i++){
    //         if(i==s.length()-1){
    //             ans += ;
    //         }else{

    //             String t= ""+s.charAt(i)+s.charAt(i+1);
    //             if(m.containsKey(t)){
    //                 ans = ans + m.get(t);
    //                 i++;
    //             }else{
    //                 String t1 = ""+ s.charAt(i);
    //                 System.out.println(t1);
    //                 System.out.println(m.get("I"));

    //                 ans = ans+ m.get(t1);
    //             }
    //         }
    //     }



    //     return ans;
    // }
}