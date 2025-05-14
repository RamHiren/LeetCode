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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i < inorder.length;i++){
            map.put(inorder[i],i);
        } 
        int n = preorder.length-1;
        int m = inorder.length-1;
        TreeNode root = BuildTree(preorder,inorder,map,0,n,0,m);
        return root;
    }

    public TreeNode BuildTree(int[] preorder, int[] inorder,HashMap<Integer,Integer> map, 
    int preStart,int preEnd,int inStart,int inEnd){
        if(preStart>preEnd || inStart>inEnd){
            return null;
        }

        int rootData = preorder[preStart];
        int rootIndex = map.get(rootData);
        TreeNode root= new TreeNode(rootData);
        int leftTreeSize = rootIndex - inStart;
        int rightTreeSize = inEnd - rootIndex;


        root.left = BuildTree(preorder,inorder,map,preStart+1,preStart+leftTreeSize,
        inStart,rootIndex-1);
        root.right = BuildTree(preorder,inorder,map,preStart+leftTreeSize+1,
        preStart+leftTreeSize+rightTreeSize,
        rootIndex+1,inEnd);

        return root;
    }
}