import java.util.*;
public class _5_LC_110_Balanced_Binary_Trees {


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



    public static void main(String RCB []){
        // root= [1,2,2,3,3,null,null,4,4]
        TreeNode root=new TreeNode(1);
        TreeNode a=new TreeNode(2);
        TreeNode b=new TreeNode(2);
        root.left=a;
        root.right=b;

        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(3);
        a.left=c;
        a.right=d;

        TreeNode e=new TreeNode(4);
        TreeNode f=new TreeNode(4);

        c.left=e;
        c.right=f;

      
        System.out.println(isBalanced(root)); // Output = False;
    }


      public static int height(TreeNode root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1+ Math.max(height(root.left),height(root.right));     
    }

    public static boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int lh=height(root.left);
        if(root.left!=null) lh++;
        int rh=height(root.right);
        if(root.right!=null) rh++;
        int d=lh-rh;
        if(d<0) d=-d;

        if(d>1) return false;
        return (isBalanced(root.left) && isBalanced(root.right));
    }

}
