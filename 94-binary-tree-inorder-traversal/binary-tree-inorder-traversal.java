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
    public static List<Integer> inorder(List<Integer> res,TreeNode root){
              if(root == null) return res;
              inorder(res,root.left);
              res.add(root.val);
              inorder(res,root.right);
              return res;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            return inorder(res,root);
    }
}