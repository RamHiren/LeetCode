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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            root = new TreeNode(val);
            return root;
        }

        TreeNode t = root;

        while(t!=null){
            if(val<t.val){
                if(t.left==null){
                    t.left = new TreeNode(val);
                    break;
                }else{
                    t = t.left;
                }
            }else{
                if(t.right==null){
                    t.right = new TreeNode(val);
                    break;
                }else{
                    t=t.right;
                }
            }
        }
        return root;
    }
}