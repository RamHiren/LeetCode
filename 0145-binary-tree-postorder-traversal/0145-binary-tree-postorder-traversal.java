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
    public List<Integer> postorderTraversal(TreeNode root) {
        //
        List<Integer> l = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode node = root;

        while(node != null || !s.isEmpty()){
            //move left
            while(node!=null){
                s.push(node);
                node = node.left;
            }

            //move right
            if(s.peek().right != null){
                node = s.peek().right;
            }else{
                TreeNode t = s.pop();
                l.add(t.val);
                while(!s.isEmpty() && t == s.peek().right){
                    t = s.pop();
                    l.add(t.val);
                }
            }
        }
        return l;

    }
}