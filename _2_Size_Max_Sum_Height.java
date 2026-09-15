import java.util.*;
 public class _2_Size_Max_Sum_Height {

     public static class Node {       
        int val;
        Node left;
        Node right;

        public Node(int val) {
           this.val=val;
        } 
    }

    public static void preorder(Node root){
        if(root==null) return ;
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }


    public static int size(Node root){
        if(root==null) return 0;
        return 1+ size(root.left) + size( root.right);
    }


    public static int sum(Node root){
        if(root==null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }


    public static int maxValue(Node root){
        if(root==null) return Integer.MIN_VALUE;  // Becaue if nodes have -ve values it gives 0 if we return 0 in Base case 
       return Math.max(root.val,Math.max(maxValue(root.left),maxValue(root.right)));
    }


    public static int height(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0; // Because of this test case we get correct ans
        return 1+ Math.max(height(root.left),height(root.right));
    }


    public static void  main(String [] RCB){
      Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        root.left=a;
        root.right=b;

        Node c=new Node(4);
        Node d=new Node(5);
        a.left=c;
        a.right=d;

        Node e=new Node(6);
        Node f=new Node(7  );

        b.left=e;
        b.right=f;
        // System.out.println(root );

        // preorder(root);
        // System.out.println(size(root));
        // System.out.println(sum(root));
        // System.out.println(maxValue(root));
        System.out.println(height(root));
    }
}
