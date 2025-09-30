package LinkedList.SinglyLinkedList.Basics;

class Node2{
    String data;
    Node2 next;

    Node2(String data){
         this.data = data;
         this.next = null;
    }
}

class Addingelemnt{
    Node2 head;

    //addLast

    public void addLast(String data){
        Node2 newNode = new Node2(data);
        if (head == null){
            head = newNode;
            return;
        }


        Node2 currNode = head;

        /// get last element
        while(currNode.next != null){
            currNode = currNode.next;  //triverse
        }
        currNode.next = newNode;
    }

    /// print
    public void printList(){
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node2 currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
}



public class AddLastElement {

    public static void main(String[] args) {

           Node2 n1 = new Node2("Hi");
           Node2 n2 = new Node2("My");
           Node2 n3 = new Node2("Name");
           Node2 n4 = new Node2("is");

           n1.next = n2 ;
           n2.next = n3 ;
           n3.next = n4;


           Addingelemnt last = new Addingelemnt();
           last.head = n1;
           last.addLast("Sarthak ");
           last.addLast("Sain");
           last.printList();
    }
}
