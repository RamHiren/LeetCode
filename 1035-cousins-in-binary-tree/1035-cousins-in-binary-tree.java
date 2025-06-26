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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        int found =0;


        while(!q.isEmpty()){
            ArrayList<Integer> l = new ArrayList<>();
            int s = q.size();

            while(s-->0){
                TreeNode n = q.poll();
                int sameP = 0;

                

                if(n.left!=null){
                    if(n.left.val==x || n.left.val==y){
                        sameP++;
                        found++;
                    }
                    q.offer(n.left);
                }

                if(n.right!=null){
                    if(n.right.val==x || n.right.val==y){
                        sameP++;
                        found++;
                    }
                    q.offer(n.right);
                }

                if(sameP==2)return false;

            }

            if(found==2)return true;
            if(found==1)return false;
           
         }
         return false;
    }
}