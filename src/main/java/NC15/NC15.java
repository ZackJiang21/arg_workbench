package NC15;

import java.util.*;


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;


    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class NC15 {
    /**
     * @param root TreeNode类
     * @return int整型ArrayList<ArrayList<>>
     */
    public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            ret.add(new ArrayList<>());
            for (int i = 0; i < len; i++) {
                TreeNode first = queue.pop();
                ret.get(ret.size() - 1).add(first.val);
                System.out.println(first.val);
                if (first.left != null) {
                    queue.add(first.left);
                }
                if (first.right != null) {
                    queue.add(first.right);
                }
            }

        }
        return ret;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9, new TreeNode(15, null, null), new TreeNode(7, null, null)), new TreeNode(20, null, null));
        System.out.println(levelOrder(root));
    }

}
