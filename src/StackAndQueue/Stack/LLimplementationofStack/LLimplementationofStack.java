package StackAndQueue.Stack.LLimplementationofStack;

class Node{
      int data;
      Node next;
      Node(int data){
          this.data = data;
          this.next = null;
      }
}

    class Stack{
      Node head = null;
      int size = 0 ;

      void push(int x){
          Node temp = new Node(x);
          temp.next  = head;
          head = temp;
          size++;
      }

      void Display(){
          Node temp = head;
          while(temp != null){
              System.out.println(temp.data + " -->");
              temp = temp.next ;

          }
          System.out.println();
      }
      public int size(){
            return size;
        }
        public int pop(){
            if(head == null){
                System.out.println("stack is Empty!");
                return -1;
            }
            int x = head.data;
            head = head.next ;
            return x;

        }
        int peek(){
           if(head == null){
               System.out.println("Stack is Empty");
               return -1 ;
           }
           return head.data;
        }

        boolean isEmpty(){
           if (size == 0)return true;
               return false;

        }
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }


public class LLimplementationofStack {
    public static void main(String[] args) {
                Stack stack = new Stack();

                // Push elements
                stack.push(10);
                stack.push(20);
                stack.push(30);

                System.out.println("Stack after pushes:");
                stack.display();  // 30 --> 20 --> 10 --> NULL

                // Peek
                System.out.println("Top element: " + stack.peek()); // 30

                // Pop
                System.out.println("Popped: " + stack.pop()); // 30

                System.out.println("Stack after pop:");
                stack.display();  // 20 --> 10 --> NULL

                // Recursive display


                // Size and empty check
                System.out.println("Stack size: " + stack.size());
                System.out.println("Is stack empty? " + stack.isEmpty());
            }
        }


