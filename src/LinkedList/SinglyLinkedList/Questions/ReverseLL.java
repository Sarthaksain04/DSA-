//package LinkedList.SinglyLinkedList.Questions;
//
//import java.sql.SQLOutput;
//import java.util.LinkedList;
//
//class Node{
//      int data;
//      Node next;
//      Node( int data ){
//          this.data = data;
//          this.next = null;
//
//      }
//}
//
//class Rev{
//    Node head;
//       void rev(){
//           Node prev = head ;
//           Node Current = head.next;
//            while(Current != null){
//                  Node next = Current.next;
//                  Current.next = prev;
//                  prev = Current;
//                  Current = next;
//
//            }
//            head.next = null;
//            head = prev ;
//
//       }
//       Node temp = head;
//
//       void Disp(){
//           Node temp = head;
//            while(temp != null){
//                System.out.print(temp.data + " --> " );
//                temp = temp.next;
//            }
//           System.out.print("null");
//       }
//}
//
//public class ReverseLL {
//    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//
//        Node n1 = new Node(list.get(0));
//        Node temp = n1;
//
//
//        for (int i = 1; i < list.size(); i++) {
//            Node newNode = new Node(list.get(i));
//            temp.next = newNode;
//            temp = newNode;
//        }
//
//       Rev r = new Rev();
//       r.head = n1;
//       r.rev();
//       r.Disp();
//
//    }
//}
