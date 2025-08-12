package OOPs.ClassandObject.Class;

class Movie {
    String title;
    String genre;
    double rating;

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating + "/10");
    }
}

public class Class9 {
    public static void main(String[] args) {
        Movie m = new Movie();
        m.title = "Inception";
        m.genre = "Sci-fi";
        m.rating = 8.8;
        m.display();
    }
}
