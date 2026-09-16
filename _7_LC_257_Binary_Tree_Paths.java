import java.util.*;
import javax.swing.tree.TreeNode;
public class _7_LC_257_Binary_Tree_Paths {

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
        //  root = [1,2,3,null,5]  Output = [1->2->5, 1->2];
        TreeNode root=new TreeNode(1);
        TreeNode a=new TreeNode(2);
        TreeNode b=new TreeNode(2);
        root.left=a;
        root.right=b;
      
        TreeNode d=new TreeNode(5);
        a.right=d;

        System.out.println(binaryTreePaths(root));  // Output = [1->2->5, 1->2];
    }

    public static void helper(TreeNode root,List<String> ans,String s){
        if(root==null) return ;
        if(root.left==null && root.right==null){
            s+=root.val;
            ans.add(s);
            return;
        }
        helper(root.left,ans,s+root.val+"->");
        helper(root.right,ans,s+root.val+"->");
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        helper(root,ans,"");
        return ans;
    }

}
