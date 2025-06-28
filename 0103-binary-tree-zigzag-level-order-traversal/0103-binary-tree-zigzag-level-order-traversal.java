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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        List<List<Integer>> l = new ArrayList<>();
        if(root==null)return l;
        int level =0;

        while(!q.isEmpty()){
            List<Integer> l1 = new ArrayList<>();
            int s = q.size();

            while(s-->0){
                TreeNode n = q.poll();  
                l1.add(n.val);
                if(n.left!=null)q.offer(n.left);
                if(n.right!=null)q.offer(n.right);
            }

            if(level%2==0){
                l.add(l1);
            }else{
                Collections.reverse(l1);
                l.add(l1);
            }
            level++;
        }
        return l;
    }
}