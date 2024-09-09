class Solution {
    public String convertDateToBinary(String a) {
        int a1 = Integer.parseInt(a.substring(0,4));
        int a2 = Integer.parseInt(a.substring(5,7));
        int a3 = Integer.parseInt(a.substring(8,10));


        String p1 = Integer.toBinaryString(a1);
        String p2 = Integer.toBinaryString(a2);
        String p3 = Integer.toBinaryString(a3);

        System.out.println(p1);

       
       

        String result = p1 + "-" + p2 + "-" + p3;

        return result;
    }
}