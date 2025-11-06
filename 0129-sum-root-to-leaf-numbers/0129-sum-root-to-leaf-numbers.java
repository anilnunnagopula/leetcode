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
    public static int sum=0;
    public void preOrder(TreeNode root,StringBuilder sb){
        if(root==null){
            // System.out.println(sb.toString());
            // sum+=Integer.parseInt(sb.toString());
            return;
        }
        sb.append(root.val);

        if (root.left==null && root.right == null) {
            sum+=Integer.parseInt(sb.toString());
        }

        preOrder(root.left,sb);
        preOrder(root.right,sb);
        sb.deleteCharAt(sb.length()-1);
    }
    public int sumNumbers(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        sum=0;
        preOrder(root,sb);
        return sum;

        
    }
}