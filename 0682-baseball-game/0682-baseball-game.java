class Solution {
    public int calPoints(String[] a) {
        Stack<Integer> s = new Stack<>();
   
        for(int i=0;i<a.length;i++){
            if(a[i].equals("+")){
                int top = s.pop();
                int newtop = top + s.peek();
                s.push(top);
                s.push(newtop);
            }else if(a[i].equals("D")){
                int x=s.peek();
                s.push(2*x);
            }else if(a[i].equals("C")){
                s.pop();
            }else{
                s.push(Integer.valueOf(a[i]));
            }
        }

        if(!s.isEmpty()){
            int sum =0;
             while(!s.isEmpty()){
                   int x = s.pop();
                    sum+=x;
                }
                return sum;
        }
        return 0;
    }
}