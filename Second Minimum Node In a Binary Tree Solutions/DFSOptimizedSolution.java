/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class DFSOptimizedSolution {

    int min = Integer.MAX_VALUE, secMin = Integer.MAX_VALUE, tracker = -1, max = Integer.MIN_VALUE;

    public int findSecondMinimumValue(TreeNode root) {

        min = root.val;
        helperFunc(root);

        if (secMin == root.val)
            secMin = -1;
        if (secMin == Integer.MAX_VALUE && (tracker == min && secMin != max)) {
            secMin = -1;
        }
        return secMin;

    }

    public void helperFunc(TreeNode root) {
        if (root == null)
            return;

        if (root.val < secMin && root.val > min) {
            secMin = root.val;
        }
        if(root.val>max){
            max = root.val;
        }
        tracker = root.val;
        

        helperFunc(root.left);
        helperFunc(root.right);
    }

}
