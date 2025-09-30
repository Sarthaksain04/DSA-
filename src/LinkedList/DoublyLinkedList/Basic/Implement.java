package LinkedList.DoublyLinkedList.Basic;

class Node{
    int data;
    Node next ;
    Node prev;

    Node(int data){
        this.data = data ;
        this.next = null;
        this.prev = null;


    }
    }

    class Print{
        Node head ;
        Node tail ;

      public  void print(){
            if(head == null){
                System.out.println("empty");
              return ;
            }

            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;

            }
          System.out.println("null");

        }
        public  void printlast(){
            if(tail == null){
                System.out.println("empty");
                return ;
            }

            Node temp2 = tail;
            while(temp2 != null){
                System.out.print(temp2.data + " -> ");
                temp2 = temp2.prev;

            }
            System.out.println("null");

        }

    }


public class Implement {
    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        Print see = new Print();

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;


        see.head = n1;
        see.print();

        n4.prev = n3;
        n3.prev = n2;
        n2.prev = n1;

        see.tail = n4;
        see.printlast();




    }

}
