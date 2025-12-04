package StackAndQueue.Queue.Deque;


class Node{
     int data ;
     Node prev;
     Node next;

     Node (int data){
          this.data = data ;
          this.prev = prev ;
          this.next = next ;
     }
}

class Dequeue{
       Node front;
       Node rear;

       Dequeue(){
            front = null;
            rear = null;
       }
       void insertfront(int data){
             Node newnode = new Node(data);
             if (front == null){
                  front = newnode;
                  rear = newnode;
             }
             else {
                  newnode.next = front;
                  front.prev = newnode;
                  front =newnode;
             }
           System.out.println(data + " Inserted At front");
       }

       void insertrear(int data){
             Node newnode = new Node(data);
             if (rear == null){
                  front = rear  = newnode;
             }
             else{
                 rear.next = newnode;
                 newnode.prev = rear;
                 rear = newnode;
             }
           System.out.println(data + "inserted at rear ");

       }
       void deleteFront(){
            if (front == null){
                System.out.println("Deque is Empty ");
                return;
            }
           System.out.println(front.data + " deleted from front");
            front = front.next;
            if (front != null)
                front.prev = null;
            else
                rear = null;
       }

       void deleteRear(){
           if (rear == null) {
               System.out.println("Deque is empty");
               return;
           }
           System.out.println(rear.data + " deleted from rear");
           rear = rear.prev;
           if(rear != null)
               rear.next = null;
           else
               front = null;
       }

       void display(){
            if (front == null){
                System.out.println("Deque : is Empty ");
                return;
            }
            Node temp = front;
           System.out.print("Deque elements: ");
           while (temp != null) {
               System.out.print(temp.data + " ");
               temp = temp.next;
           }
           System.out.println();

       }
}


public class DeuequeUsingLL {
    public static void main(String[] args) {
        Dequeue dq = new Dequeue();

        dq.insertrear(10);
        dq.insertfront(20);
        dq.insertfront(5);
        dq.insertrear(30);

        dq.display();

        dq.deleteFront();
        dq.display();

        dq.deleteRear();
        dq.display();
    }
}
