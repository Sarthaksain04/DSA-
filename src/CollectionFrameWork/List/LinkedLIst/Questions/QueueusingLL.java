package CollectionFrameWork.List.LinkedLIst.Questions;

import java.util.*;

class Node{
    int data;
    Node next;
      Node(int data){
           this.data = data ;
           this.next = null ;
      }

    private  Node front = null;
    private  Node rear = null;

      // enqueue -> add element at rear

     public void enqueue(int value){
           Node newNode = new Node(value);
           if (rear == null){
                front = rear = newNode;
                return ;
           }
           rear.next = newNode;
           rear = newNode;
     }

      // dequeue -> remove element from front
    public int dequeue(){
           if (isEmpty()){
               System.out.println("Queue is Empty");
               return -1 ;
           }

           int removed = front.data;
           front = front.next ;

           if (front == null){
               rear = null ;
           }
           return removed;

    }

    // peek → get front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }
    void Disp() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}




public class QueueusingLL {
    public static void main(String[] args) {
        Node n1 = new Node(0);
        n1.enqueue(1);
        n1.enqueue(2);
        n1.enqueue(3);
        n1.enqueue(5);
        System.out.println(n1.peek());
        System.out.println(n1.isEmpty());
        n1.Disp();
        n1.dequeue();
        n1.Disp();
    }
}
