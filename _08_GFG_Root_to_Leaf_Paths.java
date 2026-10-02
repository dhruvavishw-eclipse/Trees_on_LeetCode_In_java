import java.util.*;
import javax.swing.tree.TreeNode;

public class _8_GFG_Root_to_Leaf_Paths {

     static class Node
{
    int data;
    Node left;
    Node right;
    Node(int val)
    {
        this.data = val;
        left = null;
        right = null;
    }
}

    public static void main(String RCB []) {
        //  root = [1, 2, 3, 4, 5, N, N] Output=[[1, 2, 5], [1, 2, 5], [1, 2]];

        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(2);
        root.left=a;
        root.right=b;
      
        Node c=new Node(5);
        Node d=new Node(5);
        a.left=c;
        a.right=d;

        System.out.println(paths(root)); // Output=[[1, 2, 5], [1, 2, 5], [1, 2]];
    }


    public static void helper(Node root,ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> path){
        if(root==null) return;
        
        path.add(root.data);
        
        if(root.left==null && root.right==null){
          ans.add(new ArrayList<>(path));
        }
        else {
             helper(root.left,ans,path);
             helper(root.right,ans,path);
             
         }
         
         path.remove(path.size() - 1);
    }
    
    public static ArrayList<ArrayList<Integer>> paths(Node root) {
       ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
       ArrayList<Integer> path=new ArrayList<>();
         helper(root,ans,path);
         return ans;
    }

}
