package LinkedList.SinglyLinkedList.Basics;


class Node2 {
    String data;
    Node2 next;

    Node2(String data) {
        this.data = data;
        this.next = null;
    }
}

      class Adding{
            Node2 head;
            public void addingelement(String  val ){
                Node2 newNode = new Node2(val);
                if (head == null){
                    head = newNode;
                    return;
                }
                newNode.next = head;
                head = newNode;
            }
            public void display(){
                   Node2 temp = head;
                   while(temp != null){
                       System.out.print(temp.data + " --> ");
                       temp = temp.next;
                   }
                System.out.print("null");
            }
      }





public class AddFirst {
    public static void main(String[] args) {
        Node2 n1 = new Node2("My");
        Node2 n2 = new Node2("Name");
        Node2 n3 = new Node2("is");
        Node2 n4 = new Node2("Sarthak");
        Node2 n5 = new Node2("Sain");

        n1.next = n2 ;
        n2.next = n3 ;
        n3.next = n4 ;
        n4.next = n5 ;

        Adding A1 = new Adding();

        A1.head = n1 ;
        A1.addingelement("Hi");
        A1.display();


    }
}
