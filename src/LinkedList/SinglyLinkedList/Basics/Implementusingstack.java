package LinkedList.SinglyLinkedList.Basics;
import java.util.*;


class Node3 {
    int data;
    Node3 next;
    Node3(int data) {
        this.data = data;
        this.next = null;
    }
}
class LL1{
      Node3 head;

      void createlist(Stack<Integer> st ){
          while(st.size() > 0 ){
               int x =  st.pop();
               Node3 newNode = new Node3(x);
               newNode.next = head;     // insert at beginning
               head = newNode;
          }
      }


    void display() {
        Node3 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}



public class Implementusingstack {
    public static void main(String[] args) {
        Stack<Integer> st  = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        LL1 ll = new LL1();
        ll.createlist(st);
        ll.display();
    }
}
