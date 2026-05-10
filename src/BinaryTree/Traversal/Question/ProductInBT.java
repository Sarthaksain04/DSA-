package BinaryTree.Traversal.Question;

class Nodes1 {
    int val;
    Nodes1 left;
    Nodes1 right;

    Nodes1(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
    static int Product(Nodes1 root){
           if (root == null) return 1;

           return root.val * Product(root.left) * Product(root.right);
    }

}

    public class ProductInBT {
        public static void main(String[] args) {
            Nodes1 root = new Nodes1(1);
            Nodes1 a = new Nodes1(2);
            Nodes1 b = new Nodes1(3);

            root.left = a ;
            root.right = b ;

            Nodes1 c = new Nodes1(4);
            Nodes1 d = new Nodes1(5);
            a.left = c;
            a.right = d;

            Nodes1 e = new Nodes1(6);
            b.right = e;

            System.out.println(Nodes1.Product(root));

        }
    }

