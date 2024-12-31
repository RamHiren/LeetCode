class Solution {
    public String longestCommonPrefix(String[] str) {
        StringBuilder sb = new StringBuilder();

        Arrays.sort(str);

        char[] f = str[0].toCharArray();
        char[] l = str[str.length -1 ].toCharArray();

        for(int i=0;i<f.length;i++){
            if(f[i]==l[i]){
                sb.append(f[i]);
            }else{
                break;
            }
        }

        return sb.toString();
    }
}