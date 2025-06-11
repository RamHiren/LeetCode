/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {

        if(root==null) return 0;
        Queue<Node> q = new LinkedList<>();
        int a =0;
        q.offer(root);

        while(!q.isEmpty()){
            int s = q.size();
            

            while(s-->0){
                Node t = q.poll();
                for(Node n:t.children){
                    q.offer(n);
                }
            
            }
            a++;
        }

        return a;
    }
}