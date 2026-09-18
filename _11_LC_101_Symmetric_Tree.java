import java.util.*;
public class _11_LC_101_Symmetric_Tree {

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


    public static void main(String RCB []) {
        // root = [1,2,2,3,4,4,3]


         TreeNode root=new TreeNode(1);
        TreeNode a=new TreeNode(2);
        TreeNode b=new TreeNode(2);
        root.left=a;
        root.right=b;

        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(4);
        a.left=c;
        a.right=d;

        TreeNode e=new TreeNode(4);
        TreeNode f=new TreeNode(3);

        b.left=e;
        b.right=f;


        System.out.println(isSymmetric(root));

    }


    public static boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        root.left=invert(root.left);
        return check(root.left,root.right);
    }

    public static boolean check(TreeNode a, TreeNode b){
        if(a==null && b==null) return true;
        if(a==null || b==null) return false;
        if(a.val!=b.val) return false;

        return(check(a.left,b.left) && check(a.right,b.right));
    }

    public static TreeNode invert(TreeNode root){
        if(root==null) return root;
        TreeNode l=root.left;
        TreeNode r=root.right;

        root.left=invert(r);
        root.right=invert(l);

        return root;
    }
    
}
