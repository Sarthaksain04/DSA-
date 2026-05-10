package BinaryTree.Traversal.BreadthFirstSearchORLevelOrderTraversal;


import java.util.LinkedList;
import java.util.Queue;

class Nodes{
       int data;
       Nodes left ;
       Nodes right ;
       Nodes(int data){
            this.data = data;
            this.left = null;
            this.right = null;
       }

       public static int Level(Nodes root){
              if (root == null) return 0 ;

              return 1 +  Math.max(Level(root.left) , Level(root.right));
       }




       public static void NthLevel(Nodes Root , int n ){
              if(Root == null) return;
              if (n ==1) System.out.print(Root.data + " ");
              NthLevel(Root.left , n - 1);
              NthLevel(Root.right , n - 1);
       }

       public static void bfs(Nodes root){  // Iterative way
           Queue<Nodes> q = new LinkedList<>();
           if (root != null) q.add(root);
           while (q.size()>0){
               Nodes temp = q.peek();
               if (temp.left != null) q.add(temp.left);
               if (temp.right != null) q.add(temp.right);
               System.out.println(temp.data + " ");
               q.remove();
           }
       }

}


public class BFSorLFS {
    public static void main(String[] args) {

        Nodes Root = new Nodes(1);
        Nodes a = new Nodes(2);
        Nodes b = new Nodes(3);

        Root.left = a;
        Root.right = b;

        Nodes c = new Nodes(4);
        Nodes d = new Nodes(5);
        a.left = c;
        a.right = d;

        Nodes e = new Nodes(6);
        Nodes f = new Nodes(7);
        b.left = e;
        b.right = f;





        int level = Nodes.Level(Root);

        System.out.println("Print all of them using Nth level function");

        for (int i = 0; i <=level ; i++) {
              Nodes.NthLevel(Root , i);
        }

        System.out.println();
        System.out.println("Print level wise:");
        Nodes.NthLevel(Root , 2);




        System.out.println();
        System.out.println("Print element using Breadth First search :");
           Nodes.bfs(Root);


    }
}