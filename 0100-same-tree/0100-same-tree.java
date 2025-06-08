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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q== null) return true;
        if(p== null && q!=null || p!=null && q==null) return false;

        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();

        q1.offer(p);
        q2.offer(q);

        while(!q1.isEmpty() && !q2.isEmpty()){
            TreeNode x = q1.poll();
            TreeNode y =q2.poll();

            if(x==null && y==null) continue;
            if(x==null||y==null) return false;
            if(x.val != y.val) return false;

            q1.offer(x.left);
            q2.offer(y.left);

            q1.offer(x.right);
            q2.offer(y.right);

            
        } 

        return q1.isEmpty() && q2.isEmpty();
    }
}