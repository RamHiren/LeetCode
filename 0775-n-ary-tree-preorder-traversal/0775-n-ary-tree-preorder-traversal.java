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
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        preorder(root,l);
        return l;
    }

    public void preorder(Node node,ArrayList<Integer>l){
        if(node==null){
            return;
        }

        l.add(node.val);
        
        for(Node n:node.children){
            preorder(n,l);
        }
    }
}