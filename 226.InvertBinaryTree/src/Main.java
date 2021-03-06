public class Main {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode t = new TreeNode(root.val);
        t.left = invertTree(root.right);
        t.right = invertTree(root.left);
        return t;
    }

    public static void main(String[] args) {

    }
}
