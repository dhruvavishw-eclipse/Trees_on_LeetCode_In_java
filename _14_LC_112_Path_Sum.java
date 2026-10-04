import java.util.*;
public class _14_LC_112_Path_Sum {

     public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public static void main(String [] BKP ){
        TreeNode root=new TreeNode(1);
        TreeNode a=new TreeNode(3);
        TreeNode b=new TreeNode(4);

        root.left=a;
        root.right=b;

        int target=5;

        System.out.println(hasPathSum(root, target)); // True
    }

     public static boolean hasPathSum(TreeNode root, int target){
        if(root==null) return false;
        if(root != null && root.left==null && root.right==null){
            if(root.val==target) return true;
        }
        return  hasPathSum(root.left, target-root.val) || hasPathSum(root.right, target-root.val);
     }

}
