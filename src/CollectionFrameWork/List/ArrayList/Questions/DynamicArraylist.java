package CollectionFrameWork.List.ArrayList.Questions;

class ArrayList{

   private int[] arr ;
   private int size ;
       ArrayList(){
            arr = new int[2];
            size = 0 ;
       }
       public void add(int value){
              if(size == arr.length){
                  grow();
              }

              arr[size++] = value ;
       }

       public int get (int index){
//              checkIndex(index);
              return arr[index] ;
       }
       public void set(int index , int value){
//            checkIndex(index);
            arr[index] = value ;
       }

       public void remove(int index){
//              checkIndex(index);

           for (int i = index; i <  size - 1 ; i++) {
                arr[i] = arr[ i + 1 ];
           }
           size-- ;
       }
       public int size(){
              return size;
       }

       public int capacity(){
            return arr.length;
       }
      private void grow(){
           int newCapacity = arr.length * 2;
           int[] newArr = new int[newCapacity];
           for (int i = 0 ; i < arr.length; i++){
               newArr[i] = arr[i];
           }
           arr = newArr;
      }
//      void checkIndex(int index){
//           if (index < 0  || index >= size ){
//               throw new IndexOutOfBoundsException("invalid index");
//
//           }
//      }

      void print(){
          System.out.print("[ ");
          for (int i = 0; i < size ; i++) {
              System.out.print(arr[i] + " ");
          }
          System.out.println("]");
      }

    }




public class DynamicArraylist {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);

       list.print();
       System.out.println(list.size());
       list.remove(2);

       list.print();


    }
}
