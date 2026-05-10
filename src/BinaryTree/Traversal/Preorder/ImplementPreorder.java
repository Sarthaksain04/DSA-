package BinaryTree.Traversal.Preorder;




class Nodes{
    int val ;
    Nodes left ;
    Nodes right;

    Nodes(int val ){
        this.val = val ;
        this.left = left ;
        this.right = right ;
    }

    static void Preorder(Nodes root){
        if (root == null) return ;

        System.out.println(root.val);
        Preorder(root.left);
        Preorder(root.right);
    }

}

public class ImplementPreorder {
    public static void main(String[] args) {
        Nodes Root = new Nodes(1);
        Nodes a  = new Nodes(2);
        Nodes b = new Nodes(3);

        Root.left  =  a  ;
        Root.right =  b ;

        Nodes c = new Nodes(4);
        Nodes d = new Nodes(5);
        a.left = c ;
        a.right = d ;

        Nodes e = new Nodes(6);
        Nodes f = new Nodes(7);
        b.left = e ;
        b.right=f;

        Nodes.Preorder(Root);
    }
}
