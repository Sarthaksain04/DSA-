package LinkedList.SinglyLinkedList.Questions;

class Node1{
     int data;
     Node1 next;
     Node1( int data){
          this.data = data;
          this.next = null;
     }
}

class AddLast{
      Node1 head;
       public void Last( int x){
              Node1 newNode = new Node1(x);
              if ( head == null){
                  head = newNode;
                  return;
              }
              Node1 temp = head;
              while(temp.next != null){
                  temp = temp.next;
              }
              temp.next =newNode;
       }
     public   void disp(){
            Node1 temp1 = head;
            while(temp1 != null){
                System.out.print(temp1.data + " --> ");
                 temp1 = temp1.next;
            }
           System.out.println("null");
       }
}

public class AddingLast {
    public static void main(String[] args) {
        Node1 n1 = new Node1(1);
        Node1 n2 = new Node1(2);
        Node1 n3 = new Node1(3);
        Node1 n4 = new Node1(4);
        Node1 n5 = new Node1(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        AddLast l1 = new AddLast();
        l1.head = n1;
        l1.Last(1);
        l1.Last(2);
        l1.disp();



    }
}
