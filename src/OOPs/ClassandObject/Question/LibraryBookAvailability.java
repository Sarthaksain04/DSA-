package OOPs.ClassandObject.Question;
class LibraryBook{
     String bookName;
     boolean isIssued ;

     LibraryBook(String b){
         this.bookName = b ;
         this.isIssued = false;

     }
     void issueBook(){
         if (!isIssued){
             isIssued = true;
             System.out.println(bookName + " has been issued.");
         }
         else {
             System.out.println(bookName + " is already issued.");
         }
     }
    void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println(bookName + " has been returned.");
        } else {
            System.out.println(bookName + " was not issued.");
        }
    }
        void displayStatus() {
            System.out.println("Book Name: " + bookName);
            System.out.println("Issued: " + isIssued);
        }
}

public class LibraryBookAvailability {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Clean Code");
        book1.displayStatus();
        book1.issueBook();
        book1.displayStatus();
        book1.returnBook();
        book1.displayStatus();


    }
}
