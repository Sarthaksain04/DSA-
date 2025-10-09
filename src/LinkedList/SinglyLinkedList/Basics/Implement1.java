package LinkedList.SinglyLinkedList.Basics;

import java.sql.SQLOutput;

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

class LL{
      Node1 head ;
      void Display(){
          Node1 temp = head ;
          while(temp !=  null){
              System.out.print(temp.data + " --> ");
              temp = temp.next;
          }
          System.out.println(" null");
      }
}

public class Implement1 {
    public static void main(String[] args) {
     Node1 n1 = new Node1(1);
     Node1 n2 = new Node1(2);
     Node1 n3 = new Node1(3);
     Node1 n4 = new Node1(4);
     Node1 n5 = new Node1(5);
     Node1 n6 = new Node1(6);

      n1.next = n2;
      n2.next = n3;
      n3.next = n4;
      n4.next = n5;
      n5.next = n6;

      LL l = new LL();

     l.head = n1;
     l.Display();




    }
}
