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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> que=new LinkedList<>();
        if(root==null)return 0;
        que.add(root);
        List <Long> arr=new ArrayList<>();
        int lvl=1;
        while(!que.isEmpty()){
            long sum=0;
            int n=que.size();
            for(int i=0;i<n;i++){
                TreeNode curr=que.poll();
                if(curr.left!=null)que.add(curr.left);
                if(curr.right!=null)que.add(curr.right);
                sum+=(long)(curr.val);
            }
            arr.add(sum);
            lvl++;
        }
        if (k>=lvl)return -1;
        Collections.sort(arr);
        return arr.get(arr.size()-k);
    }
}