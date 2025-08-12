package OOPs.ClassandObject.Constructor.ParametrizedConstructor;

class Movie {
    String title;
    double rating;

    Movie(String t, double r) {
        title = t;
        rating = r;
    }

    void display() {
        System.out.println("Movie: " + title + ", Rating: " + rating);
    }
}


public class ex6 {
    public static void main(String[] args) {
        Movie m = new Movie("Avengers Endgame" , 5.5);
        m.display();
    }
}
