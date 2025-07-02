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
    int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        int s = getSum(root, 0);
        System.out.println(s);

        makeTree(root, s);    
        return root;
    }

    public void makeTree(TreeNode root, int s) {
        if (root == null) return;

        makeTree(root.left, s);

        int x = root.val;
        root.val = s - sum;
        sum += x;

        makeTree(root.right, s);
    }

    public int getSum(TreeNode root, int s) {
        if (root == null) return 0;

        int l = getSum(root.left, s);
        int r = getSum(root.right, s);

        return l + r + root.val;
    }
}
