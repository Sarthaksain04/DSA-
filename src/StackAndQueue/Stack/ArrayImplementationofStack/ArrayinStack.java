package StackAndQueue.Stack.ArrayImplementationofStack;


import java.sql.SQLOutput;

class Stack{
     private int [] arr = new int[5];
     private int idx = 0;

     void push( int x ){
          if (isfull()){
              System.out.println("Stack is Empty");
              return;
          }
          arr[idx] = x ;
          idx++;
     }
     int peek (){
         if (idx == 0 ){
             System.out.println("Stack is Empty");
             return -1;
         }
         return arr[idx - 1 ];
     }
     int pop(){
          if (idx == 0 ){
              System.out.println("Stack is Empty ");
              return -1 ;

          }
          int top = arr[idx  -1 ];
          arr[idx - 1 ] = 0 ;
          idx--;
          return top;
    }
    void display(){
        for (int i = 0; i <idx - 1  ; i++) {
            System.out.println(arr[i]+ " ");

        }
        System.out.println();
    }
    int size(){
         return idx ;
    }
    boolean isEmpty (){
          if(idx == 0){
               return true;

          }else return false ;
    }
    boolean isfull(){
            if (idx  == arr.length) return true;
            else return false;

    }

}

public class ArrayinStack {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

    }
}
