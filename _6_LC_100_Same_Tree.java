import java.util.*;
public class _6_LC_100_Same_Tree {

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


    public static void main(String RCB[]) {
        TreeNode p=new TreeNode(1);
        TreeNode q=new TreeNode(2);
        TreeNode r=new TreeNode(3);

        p.left=q;
        p.right=r;

        TreeNode x=new TreeNode(1);
        TreeNode y=new TreeNode(2);
        TreeNode z=new TreeNode(3);

        x.left=y;
        x.right=z;

        
        System.out.println( isSameTree( p, x));
    }


    public static boolean isSameTree(TreeNode p, TreeNode x){
        if(p==null && x==null) return true;
        if(p==null || x==null) return false;
        if(p.val != x.val) return false;
        return isSameTree(p.left, x.left) && isSameTree(p.right, x.right);
    }

}
