class Solution {
    public String longestCommonPrefix(String[] str) {
        int a[] =new int[str.length];
        String s = "";

        for(int i=0;i<str.length;i++){
            String t = str[i];
            a[i] = t.length();
        }
        Arrays.sort(a);
        for(int i=0;i<a[0];i++){
            int f=1;
            for(int j=0;j<str.length;j++){
                if((str[0]).charAt(i) != ((str[j]).charAt(i))){
                    f=0;
                }
            }
            if(f==1){
                s = s +  ((str[0]).charAt(i));
            }else{
                break;
            }
        }

        return s;
    }
}