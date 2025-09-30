package LinkedList.SinglyLinkedList.Basics;


// this is the Node Structure  in which there is
// Data And there is next which stores the address of nect node

class Node{       // Class (BluePrint) and structure of node
    String Data;
    Node next ;

    Node(String Data){
        this.Data = Data;
        this.next = null ;
    }
}


public class Implement {
    public static void main(String[] args) {

        // Creating nodes Here with help of Node class we Insert the values in node

       Node n1 = new Node("my");
       Node n2 = new Node("Name");
       Node n3 = new Node("is");
       Node n4 = new Node("Sarthak Sain");


        //Link nodes together
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Node temp = n1 ;

        while (temp != null){
            System.out.print(temp.Data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }

}
