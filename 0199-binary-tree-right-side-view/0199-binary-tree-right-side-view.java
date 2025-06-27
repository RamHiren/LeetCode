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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> l = new ArrayList<>();
        if(root==null)return l;


        q.offer(root);

        while(!q.isEmpty()){
            int s = q.size();
            List<Integer> l1 = new ArrayList<>();
            while(s-->0){
              TreeNode n = q.poll();
              l1.add(n.val);
              if(n.left!=null){
                q.offer(n.left);
              } 
              if(n.right!=null){
                q.offer(n.right);
              }
            }
            l.add(l1.get(l1.size()-1));
        }

        return l;
    }
}