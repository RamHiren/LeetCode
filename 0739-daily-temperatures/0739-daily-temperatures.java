class Solution {
    public int[] dailyTemperatures(int[] a) {
        Stack<Integer> s = new Stack<>();
        int b[] = new int[a.length];

        for(int i=a.length-1;i>=0;i--){
            while(!s.isEmpty() && a[s.peek()]<=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                b[i]=0;
            }else{
                b[i] = s.peek()-i;
            }
            s.push(i);
        }
        return b;
    }
}