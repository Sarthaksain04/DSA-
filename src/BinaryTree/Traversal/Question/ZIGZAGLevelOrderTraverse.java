package BinaryTree.Traversal.Question;



class Nodes4 {
    int data;
    Nodes4 left;
    Nodes4 right;

    Nodes4(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static int Level(Nodes4 root){
        if (root == null) return 0 ;

        return 1 +  Math.max(Level(root.left) , Level(root.right));
    }
    public static void NthLevel(Nodes4 Root , int n ){ // left to right
        if(Root == null) return;
        if (n ==1) System.out.print(Root.data + " ");
        NthLevel(Root.left , n - 1);

        NthLevel(Root.right , n - 1);

    }
    public static void NthLevel2(Nodes4 Root , int n ){ // left to right
        if(Root == null) return;
        if (n ==1) System.out.print(Root.data + " ");
        NthLevel2(Root.right , n - 1);
        NthLevel2(Root.left , n - 1);


    }

}

public class ZIGZAGLevelOrderTraverse {
    public static void main(String[] args) {
        Nodes4 Root = new Nodes4(1);
        Nodes4 a = new Nodes4(2);
        Nodes4 b = new Nodes4(3);

        Root.left = a;
        Root.right = b;

        Nodes4 c = new Nodes4(4);
        Nodes4 d = new Nodes4(5);
        a.left = c;
        a.right = d;

        Nodes4 e = new Nodes4(6);
        Nodes4 f = new Nodes4(7);
        b.left = e;
        b.right = f;

        int level = Nodes4.Level(Root);

        System.out.println("Print all of them using Nth level function");

        for (int i = 0; i <=level ; i++) {

            if(i %2 != 0 ) Nodes4.NthLevel(Root , i );

            else Nodes4.NthLevel2(Root , i);

        }


    }
}
