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
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        ArrayList<Integer> l= new ArrayList<>();
        postorder(root,l);
        return l; 
    }

    public void postorder(Node node,ArrayList<Integer> l){
        if(node==null)return;

        for(Node n:node.children){
            postorder(n,l);
        }
        l.add(node.val);
    }
}