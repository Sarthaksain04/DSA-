package OOPs.ClassandObject.Question;

//30. Real-World Library System Complete Description: Create books, users, and borrowing logic using objects only. Track issued books and returns. Brief Description: Tests deep understanding of object modeling and relationships. give all the variables and Method

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Books{
     int BookId;
     String title;
     String author;
     String category ;
     boolean isIssued;
     User issuedTo;
     Date issuedDate;
     Date dueDate;

     Books(int BookId , String title , String author, String category){
           this.BookId = BookId;
           this.title = title;
           this.author = author;
           this.category = category;
     }
     void issueBook(User user){


     }
     void returnBook(){

     }
     boolean isAvailable(){

         return isAvailable();
     }
     void getBookDetails(){

     }
    int  getBook(){
        return BookId;
    }


}



class User{
    int userId;
    String name;
    String email;
    List<Books> borrowedBooks;
    int maxBookAllowed ;
    User(int userId , String name , String email ){
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.maxBookAllowed = 10 ;
        borrowedBooks = new ArrayList<>();


    }
    void borrowBook(Books book){
         borrowedBooks.add(book);
    }
    void returnBooks(Books book){

    }
    void getBorrowedBook(){

    }
    void canBorrowMoreBooks(){

    }
    void getuserDetails(){

    }

}



class Library{
    String libraryName;
    List<Books> books ;
    List<User> users;
    int totalBooks;
    int issuedBooksCount;
    Library(String libraryName){
        this.libraryName = libraryName;
          books = new ArrayList<>();
          users = new ArrayList<>();
    }




    void addBook(Books book){
         books.add(book);
        System.out.println("Book Added ");
        System.out.println(++totalBooks);
    }


    void removeBook(int bookid){
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).BookId == bookid) {
                books.remove(i); // ✅ CORRECT
                return;
            }
        }
    }

    void registerUser(User user){

    }
    void issueBook(int BookId , int userId){

    }
    void returnBook(int BookId){

    }
    void findBookById(int bookId){

    }
    void findUserById(int userId){

    }
    void displayAvailableBooks(){

    }
    void displayIssuedBooks(){

    }
}




public class RealWorldLibrarySystem {
    public static void main(String[] args) {
//        Books
        Books b1  = new Books(1 , "Clean Code" , "Robert C. Martin" , "Programming");
        Books b2  = new Books(2 , "Effective Java" , "Joshua Bloch" , "Programming");
        Books b3  = new Books(3 , "Introduction to Algorithms" , "Thomas H. Cormen" , "Computer Science");
        Books b4  = new Books(4 , "Design Patterns" , "Erich Gamma" , "Software Engineering");
        Books b5  = new Books(5 , "The Pragmatic Programmer" , "Andrew Hunt" , "Programming");
        Books b6  = new Books(6 , "Data Structures Using C" , "Reema Thareja" , "Computer Science");
        Books b7  = new Books(7 , "Operating System Concepts" , "Abraham Silberschatz" , "Operating Systems");
        Books b8  = new Books(8 , "Computer Networks" , "Andrew S. Tanenbaum" , "Networking");
        Books b9  = new Books(9 , "Database System Concepts" , "Henry F. Korth" , "Databases");
        Books b10 = new Books(10 , "Artificial Intelligence: A Modern Approach" , "Stuart Russell" , "AI");

        Books b11 = new Books(11 , "The Alchemist" , "Paulo Coelho" , "Fiction");
        Books b12 = new Books(12 , "Atomic Habits" , "James Clear" , "Self-Help");
        Books b13 = new Books(13 , "Rich Dad Poor Dad" , "Robert T. Kiyosaki" , "Finance");
        Books b14 = new Books(14 , "Think and Grow Rich" , "Napoleon Hill" , "Self-Help");
        Books b15 = new Books(15 , "The Power of Habit" , "Charles Duhigg" , "Psychology");
        Books b16 = new Books(16 , "Wings of Fire" , "A. P. J. Abdul Kalam" , "Biography");
        Books b17 = new Books(17 , "Sapiens" , "Yuval Noah Harari" , "History");
        Books b18 = new Books(18 , "Ikigai" , "Hector Garcia" , "Philosophy");
        Books b19 = new Books(19 , "The Theory of Everything" , "Stephen Hawking" , "Science");
        Books b20 = new Books(20 , "A Brief History of Time" , "Stephen Hawking" , "Science");

        Library l = new Library("Ananta");
        l.addBook(b1);
        l.addBook(b2);
        l.addBook(b3);
        l.addBook(b4);
        l.addBook(b5);
        l.addBook(b6);
        l.addBook(b7);
        l.addBook(b8);
        l.addBook(b9);
        l.addBook(b10);
        l.addBook(b11);
        l.addBook(b12);
        l.addBook(b13);
        l.addBook(b14);
        l.addBook(b15);
        l.addBook(b16);
        l.addBook(b17);
        l.addBook(b18);
        l.addBook(b19);
        l.addBook(b20);

        l.removeBook(1);
//      Users
        User U1  = new User(1 , "Sarthak" , "sarthaksain08@gmail.com");
        User U2  = new User(2 , "Aman" , "aman.kumar@gmail.com");
        User U3  = new User(3 , "Rohit" , "rohit.sharma@gmail.com");
        User U4  = new User(4 , "Priya" , "priya.verma@gmail.com");
        User U5  = new User(5 , "Neha" , "neha.singh@gmail.com");
        User U6  = new User(6 , "Ankit" , "ankit.mehta@gmail.com");
        User U7  = new User(7 , "Pooja" , "pooja.patel@gmail.com");
        User U8  = new User(8 , "Rahul" , "rahul.jain@gmail.com");
        User U9  = new User(9 , "Kunal" , "kunal.malhotra@gmail.com");
        User U10 = new User(10 , "Simran" , "simran.kaur@gmail.com");

    }
}
