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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> que=new LinkedList<>();
        if(root==null)return 0;
        que.add(root);
        int max=Integer.MIN_VALUE;
        int lvl=1;
        int j=1;
        while(!que.isEmpty()){
            int n=que.size();
            int sum=0;
            for(int i=0;i<n;i++){
                TreeNode curr=que.poll();
                if(curr.left!=null)que.add(curr.left);
                if(curr.right!=null)que.add(curr.right);
                sum+=curr.val;
            }
            if(sum>max){
                max=sum;
                lvl=j;
            }
            j++;
        }
        return lvl;
    }
}