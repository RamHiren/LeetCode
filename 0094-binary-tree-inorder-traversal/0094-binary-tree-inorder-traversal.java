/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> l = new ArrayList<>();
        inorder(root,l);
        return l;
    }

    public void inorder(TreeNode node,ArrayList<Integer>l){
        if(node == null){
            return;
        }

        inorder(node.left,l);
        l.add(node.val);
        inorder(node.right,l);
    }
}