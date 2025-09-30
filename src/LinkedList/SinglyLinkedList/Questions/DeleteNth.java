package LinkedList.SinglyLinkedList.Questions;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

}

class Nthelement{

    public Node DeleteNthNode(Node head , int n ){
        if(head.next == null){
            return null;
        }
        int size = 0 ;
        Node temp = head ;
        while(temp != null){
            temp = temp.next ;
            size++;
        }
        if(n == size){
            return head.next;
        }
        int element = size - n ;
        Node curr = head ;
        for( int i = 1 ; i < element ; i++ ){
            curr = curr.next;

        }
        curr.next = curr.next.next;
        return head;

    }

}



public class DeleteNth {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);


        n1.next = n2;
        n2.next = n3 ;
        n3.next = n4 ;
        n4.next = n5;

        Node print = n1;
        while(print != null ){
            System.out.print(print.data + " -> ");
            print = print.next;

        }
        System.out.println("null");

        Nthelement ans = new Nthelement();
        Node newHead = ans.DeleteNthNode(n1 , 2);

        Node print2 = newHead;
        while (print2 != null){
            System.out.print(print2.data + " -> ");
            print2 = print2.next;
        }
        System.out.println("null");
    }
}
