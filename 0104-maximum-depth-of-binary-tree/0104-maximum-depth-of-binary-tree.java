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
    public int maxDepth(TreeNode root) {
        // if(root==null)return 0;
        // int l =0;
        // Queue<TreeNode> q = new LinkedList<>();
        // q.offer(root);

        // while(!q.isEmpty()){
        //     int size = q.size();
        //     while(size>0){
        //         TreeNode n = q.poll();

        //         if(n.left != null){
        //             q.offer(n.left);
        //         }
        //         if(n.right != null){
        //             q.offer(n.right);
        //         }
        //         size--;
        //     }
        //     l++;
        // }
        

        // return l;

        if(root==null) return 0;

        int rh = maxDepth(root.left);
        int lh = maxDepth(root.right);

        return (1+Math.max(rh,lh));
        
    }
}