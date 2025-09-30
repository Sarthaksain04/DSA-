package LinkedList.SinglyLinkedList.Basics;

import java.sql.SQLOutput;

class Node1{
    String data;
    Node1 next;

    Node1(String data){
        this.data = data ;
        this.next = null;
    }
}

class Addingfirstelement{
    Node1 head;


    //add - first
    public void addfirst(String data){
        Node1 newNode = new Node1(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    void printList(){
        Node1 temp = head ;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    }




public class AddFirstElement {
    public static void main(String[] args) {
        Node1 n1 = new Node1("My");
        Node1 n2 = new Node1("Name");
        Node1 n3 = new Node1("is");
        Node1 n4 = new Node1("Sarthak Sain");

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Addingfirstelement list = new Addingfirstelement();
        list.head = n1;  // attach the chain as the list head
        list.addfirst("hello");
        list.printList();
    }
}
