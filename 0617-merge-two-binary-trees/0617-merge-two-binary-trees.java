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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode a = getNew(root1,root2);
        return a;
    }

    public TreeNode getNew(TreeNode r1 , TreeNode r2){
        if(r1==null){
            return r2;
        }
         if(r2==null){
            return r1;
        }

        TreeNode t = new TreeNode(r1.val + r2.val);

        t.left = getNew(r1.left,r2.left);
        t.right = getNew(r1.right,r2.right);

        return t;
        
    }
}