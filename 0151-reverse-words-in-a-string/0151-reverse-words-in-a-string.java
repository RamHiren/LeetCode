class Solution {
    public String reverseWords(String s) {
        String arr[] = s.trim().split("\\s+");
        String ans[] = new String[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            ans[ans.length-1-i]=arr[i];
        }
        String ans1 = "";
        for(int i=0;i<ans.length;i++){
            if(i==ans.length-1){
                ans1 = ans1 + ans[i];
            }else{
                ans1 = ans1 + ans[i] + " ";
            }
        }

        return ans1;
    }
}