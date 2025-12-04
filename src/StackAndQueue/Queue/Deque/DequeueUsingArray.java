package StackAndQueue.Queue.Deque;

public class DequeueUsingArray {

       int[] arr;
       int front;
       int rear;
       int size;
       int capacity;

       DequeueUsingArray(int capacity){
             this.capacity = capacity;
             arr = new int[capacity];
             front = -1;
             rear = -1;
             size = 0;
       }
       public boolean isFull(){
            return (size == capacity);
       }
       public boolean isEmpty(){
           return (size == 0);
       }
       void InsertFront(int x){
           if(isFull()){
               System.out.println("Dequeis Full");
               return;
           }
           if (front ==-1){
               front= 0 ;

           }
           else{
               front = (front - 1 + capacity ) % capacity;
           }
           arr[front] = x ;
           size++;
       }

       void InsertRear(int x){
           if(isFull()){
               System.out.println("Deque is Full");
               return;
           }

           if (front == -1){
               front = 0 ;
               rear = 0 ;

           }
           else {
                rear = (rear + 1 ) % capacity;
           }
           arr[rear] = x ;
           size++;

       }

       void DeleteFront(){
            if(isEmpty()){
                System.out.println("Deque is Empty");
                return;
            }
            if (front == rear){
                 front = -1 ;
                 rear = 0;
            }
            else {
                front = (front + 1) % capacity;
            }
            size--;
       }

       void DeleteRear(){
            if (isEmpty()){
                System.out.println("Deque is Empty");
                return;
            }
            if (front == rear){
                 front = -1 ;
                 rear = 0 ;
            }
            else{
                rear = (rear -1 + capacity) % capacity;
            }
            size--;
       }

       //Get front element
    int GetFront(){
           if (isEmpty()){
               System.out.println("Deque is Empty");
               return -1;
           }
           return  arr[front];
    }

    public int getRear(){
            if (isEmpty()){
                System.out.println("Deque is empty");
                return -1 ;
            }
            return arr[rear ];
    }

    public void display (){
            if (isEmpty()){
                System.out.println("Deque is Empty");
                return ;

            }
        System.out.println("Deque : ");
            for (int i = 0 ; i < size ; i++){
                 int index = (front + i) % capacity;
                System.out.println(arr[index] + " ");
            }
        System.out.println();
    }
    

    public static void main(String[] args) {
        DequeueUsingArray dq = new DequeueUsingArray(5);

        dq.InsertFront(10);
        dq.InsertRear(20);
        dq.InsertFront(5);
        dq.display();

        dq.DeleteRear();
        dq.display();

        dq.InsertFront(15);
        dq.InsertRear(25);
        dq.display();

        System.out.println("Front: " + dq.GetFront());
        System.out.println("Rear: " + dq.getRear());
    }
}
