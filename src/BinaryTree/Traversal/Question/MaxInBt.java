package BinaryTree.Traversal.Question;

class Node3 {
    int data;
    Node3 left;
    Node3 right;

    Node3(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }


    static int Maxvalue(Node3 root) {
        if (root == null) return 0;  // Integer.MIN_VALUE if all values are negative

        int a = root.data;
        int b = Maxvalue(root.left);
        int c = Maxvalue(root.right);


        return Math.max(a , Math.max(b , c )) ;
    }
}

public class MaxInBt {
    public static void main(String[] args) {
          Node3 root = new Node3(2);
          Node3 a    = new Node3(4);
          Node3 b    = new Node3(10);

          root.left = a ;
          root.right = b;


          Node3 c = new Node3(6);
          Node3 d = new Node3(15);

          a.left  = c ;
          a.right = d ;


          Node3 e = new Node3(11);
          b.right = e;


        System.out.println(Node3.Maxvalue(root));

    }
}
