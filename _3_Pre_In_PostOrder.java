import java.util.*;
public class _3_Pre_In_PostOrder {

    public static class Node {       
        int val;
        Node left;
        Node right;

        public Node(int val) {
           this.val=val;
        }
    }


    public static void preOrder(Node root){
        // Preorder is ROOT->LEFT->RIGHT        
        if(root==null) return;
        System.out.print(root.val+" "); // Output = 1 2 4 5 3 6 7 ;
        preOrder(root.left);
        preOrder(root.right);
    }


    public static void inOrder(Node root){
        // inOrder is LEFT->ROOT->RIGHT 
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.val+" "); // Output = 4 2 5 1 6 3 7 ;
        inOrder(root.right);
    }


    public static void postOrder(Node root){
         // inOrder is LEFT->RIGHT->ROOT 
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" "); // Output =4 5 2 6 7 3 1 ;
    }


    public static void main(String[] RCB) {
        
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

        preOrder(root);
        // inOrder(root);
        // postOrder(root);
        
    }
}
