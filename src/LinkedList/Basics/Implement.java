package LinkedList.Basics;





public class Implement {
        Node head;
        class Node{
            String data;
            Node next;

            Node(String data){
                this.data = data;
                this.next = null;
            }
        }

// add - first , last-{The implementaion of adding at last is difficult  }
     public void addFirst(String data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode ;
                return;
            }
            newNode.next = head;
            head = newNode;
     }

//     add-last

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode ;
            return;
        }
        Node currNode = head;
        while(currNode.next !=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList(){
            if (head == null){
                System.out.println("list is empty ");
                return;
            }
        Node currNode = head;
        while(currNode !=null){
            System.out.println(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
           Implement list = new Implement();
           list.addFirst("i");
           list.addFirst("am");
           list.addFirst("Sarthak");
           list.printList();
    }

}
