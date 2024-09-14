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
    public void postorder(TreeNode root,List<Integer> s)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left,s);
        postorder(root.right,s);
        s.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> s = new ArrayList<>();
        postorder(root,s);
        return s;
    }
}