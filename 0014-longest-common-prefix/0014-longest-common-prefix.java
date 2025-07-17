class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));

        int a[] = new int[strs.length];
        for(int i=0;i<strs.length;i++){
            a[i]=strs[i].length();
        }

        // System.out.println(Arrays.toString(a));
        Arrays.sort(a);

        String s ="";
        for(int i=0;i<a[0];i++){
            if(strs[strs.length-1].charAt(i)==strs[0].charAt(i)){
                s += strs[0].charAt(i);
            }else{
                break;
            }
        }

        return s;
    }
}