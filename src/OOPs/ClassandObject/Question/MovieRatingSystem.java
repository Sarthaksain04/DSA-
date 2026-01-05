package OOPs.ClassandObject.Question;

//14. Movie Rating System
//
//Complete Description:
//Create a class Movie with name, rating, and reviewsCount.
//Add a method to update rating based on new review input.
//
//Brief Description:
//Shows dynamic modification of object state.


class Movie{
      String Name;
      double rating;
      int reviewsCount;

      Movie(String n , double r , int re){
          this.Name = n;
          this.rating = r ;
          this.reviewsCount = re;
      }
      void updaterating(double newReview ){
          double totalRating = rating * reviewsCount;
          totalRating = totalRating + newReview;
          reviewsCount++;
          rating = totalRating / reviewsCount;


      }
    void display() {
        System.out.println("Movie Name: " + Name);
        System.out.println("Rating: " + rating);
        System.out.println("Total Reviews: " + reviewsCount);
        System.out.println("----------------------");
    }
}

public class MovieRatingSystem {
    public static void main(String[] args) {
        Movie movie = new Movie("Inception", 4.5, 10);
        movie.display();
        movie.updaterating(5.0);
        movie.display();


    }
}
