import java.util.*;

import org.w3c.dom.Node;
public class _9_LC_236_LCA_Of_a_Binary_Tree {

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
        // root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
        // Because of different data type , something wrong happens here ;
        TreeNode p=new TreeNode( 5);
        TreeNode q=new TreeNode(4);

        TreeNode root=new TreeNode(3);
        TreeNode a=new TreeNode(5);
        TreeNode b=new TreeNode(1);
        root.left=a;
        root.right=b;

        TreeNode c=new TreeNode(6);
        TreeNode d=new TreeNode(2);
        a.left=c;
        a.right=d;

        TreeNode e=new TreeNode(0);
        TreeNode f=new TreeNode(8);

        b.left=e;
        b.right=f;

        TreeNode g=new TreeNode(7);
        TreeNode h=new TreeNode(4);

        d.left=g;
        d.right=h;

        System.out.println(lowestCommonAncestor(root, p, q));

        

    }


    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if ( root == null) return null;
        if (root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) return root;
        else if (right == null)return left;

        return right;
    }

}
