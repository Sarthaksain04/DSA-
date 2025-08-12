package OOPs.ClassandObject.Object;


class Book {
    String title;
    String author;
    int pages;

    void setInfo(String t, String a, int p) {
        title = t;
        author = a;
        pages = p;
    }

    void displayInfo() {
        System.out.println(title + " by " + author + " - " + pages + " pages");
    }
}


public class MethodObj5 {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setInfo("Geeta" , "Shree Krishna " , 120);
        b1.displayInfo();
    }
}
