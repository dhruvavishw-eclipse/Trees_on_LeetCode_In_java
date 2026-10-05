import java.util.*;
public class _17_LC_114_Flatten_Binary_Tree_to_Linked_List {

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

    public static void main(String [] RCB ){
      
        TreeNode root=new TreeNode(1);
        TreeNode a=new TreeNode(2);
        TreeNode b=new TreeNode(5);
        root.left=a;
        root.right=b;

        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(4);
        a.left=c;
        a.right=d;

        TreeNode e=new TreeNode(6);
        b.right=e;

    //   flatten(root);
    flatten2(root);
    
     
    }

    public static void flatten(TreeNode root) {
        if(root==null) return ;
        TreeNode leftTree=root.left;
        TreeNode rightTree=root.right;

        root.left=null;

        flatten(leftTree);
        flatten(rightTree);

        root.right=leftTree;
        TreeNode temp=leftTree;
        
        while(temp!=null && temp.right!=null){
            temp=temp.right;
        }
        if(temp!=null) temp.right=rightTree;
        else{
            root.right=rightTree;
        }
        return;
    }


    public static void flatten2(TreeNode root){
        TreeNode curr=root;  // TC O(n);
        while(curr!=null){
            if(curr.left!=null){
                TreeNode pred=curr.left;

                while(pred.right!=null){
                    pred=pred.right;
                }

                pred.right=curr.right;
                curr.right=curr.left;
                curr.left=null;
            }
            curr=curr.right;
        }
    }


}
