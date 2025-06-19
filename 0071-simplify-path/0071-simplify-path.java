class Solution {
    public String simplifyPath(String s) {
        Stack <String> stack = new Stack<>();
        String [] st = s.split("/");
        // System.out.println(Arrays.toString(st));
        for(String i : st){
            if(i.equals("") || i.equals(".")) continue;
            else if(i.equals("..")) {
                if(!stack.isEmpty())stack.pop();
            }else {

                stack.push(i);
            }
        }

        System.out.println(stack);

       StringBuilder sb = new StringBuilder();
        for (String d : stack) {
            sb.append("/").append(d);
        }

        System.out.println(sb);

        if(sb.length()==0)return "/";

        return sb.toString();
    }
}