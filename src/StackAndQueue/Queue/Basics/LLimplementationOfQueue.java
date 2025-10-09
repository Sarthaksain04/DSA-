package StackAndQueue.Queue.Basics;

import com.sun.source.tree.WhileLoopTree;

class Node{
      int val;
      Node next;

      Node(int val){
          this.val = val;
          this.next = null;
      }
}

        class queue{
            Node head = null;
            Node tail = null;
            int size = 0;

            public void add(int x ){
                Node temp = new Node(x);
                if (size == 0 ){
                    head = tail = temp;
                }
                else{
                    tail.next = temp;
                    tail = temp;
                }
                size++;
            }
            public int peek() {
                if (size ==0){
                    System.out.println("Queue is Empty!");
                    return -1 ;
                }
                return head.val;
                }
                public int remove(){
                   if (size == 0){
                       System.out.println("queue is empty !");
                       return  -1 ;
                   }
                   int x = head.val;
                   head = head.next ;
                   size--;
                   return x;

                }
                void display(){
                    if(size == 0){
                        System.out.println("queue is Empty!");

                    }
                    Node temp = head ;
                    while(temp != null ){
                        System.out.println(temp.val);
                        temp = temp.next;
                    }
                }
            }



public class LLimplementationOfQueue {
    public static void main(String[] args) {
        queue q1 = new queue();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.display();
        System.out.println();
        System.out.println(q1.peek());
        System.out.println(q1.size );

    }
}
