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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> que=new LinkedList<>();
        List<Double> list=new ArrayList<>();
        if(root==null)return list;
        que.add(root);
        while(!que.isEmpty()){
            int n=que.size();
            double d=0d;
            for(int i=0;i<n;i++){
                TreeNode curr=que.poll();
                if(curr.left!=null)que.add(curr.left);
                if(curr.right!=null)que.add(curr.right);
                d+=curr.val;
            }
            list.add(d/n);
        }
        return list;
    }
}