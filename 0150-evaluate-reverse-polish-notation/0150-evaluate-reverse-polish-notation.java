class Solution {
    public int evalRPN(String[] a) {
        Stack<Integer> s = new Stack<>();

        for(int i=0;i<a.length;i++){
            if(a[i].equals("+")){
                int x = s.pop();
                int y= s.pop();
                s.push(x+y);
            }else if(a[i].equals("-")){
                int x = s.pop();
                int y= s.pop();
                s.push(y-x);
            }else if(a[i].equals("*")){
                int x = s.pop();
                int y= s.pop();
                s.push(x*y);
            }else if(a[i].equals("/")){
                int x = s.pop();
                int y= s.pop();
                s.push(y/x);
            }else{
                s.push(Integer.valueOf(a[i]));
            }
        }

        return s.peek();
    }
}