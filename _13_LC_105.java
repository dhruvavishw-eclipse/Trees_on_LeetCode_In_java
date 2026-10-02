import java.util.*;
import javax.swing.tree.TreeNode;

public class _13_LC_105 {


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

    public static void main(String [] RCB){
       int [] preorder =  {3,9,20,15,7};
       int [] inorder = {9,3,15,20,7};
    
       System.out.println(buildTree(preorder, inorder));
    }


     public static TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        return traversal(preorder,0,n-1,inorder,0,n-1);
    }


    public static TreeNode traversal(int[] preorder, int prelow,int prehigh,int [] inorder, int inlow,int inhigh){
           if(prelow>prehigh) return null;
           TreeNode root=new TreeNode(preorder[prelow]);
           int i=inlow;
           while(inorder[i]!=preorder[prelow]) i++;
           int leftsize=i-inlow;
           root.left=traversal(preorder,prelow+1,prelow + leftsize,inorder,inlow,i-1);
           root.right=traversal(preorder,prelow + leftsize+1,prehigh,inorder,i+1,inhigh);
           return root;
    }


}
