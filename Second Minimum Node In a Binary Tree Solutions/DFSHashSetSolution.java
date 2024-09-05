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
class DFSHashSetSolution {

    HashSet<Integer> set = new HashSet<>();

    public int findSecondMinimumValue(TreeNode root) {
        helperFunc(root);
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int secMin = -1;
        if(list.size()>1){
         secMin = list.get(1);
        if (secMin == root.val)
             secMin = -1;
        }
        return secMin;

    }

    public void helperFunc(TreeNode root) {
        if (root == null)
            return;

        set.add(root.val);
        helperFunc(root.left);
        helperFunc(root.right);
    }

}
