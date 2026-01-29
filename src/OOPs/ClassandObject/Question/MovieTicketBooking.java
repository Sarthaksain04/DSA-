package OOPs.ClassandObject.Question;


//26. Movie Ticket Booking
//
//Complete Description:
//Create a MovieTicket class with seat availability.
//Book tickets and reduce seat count.
//
//Brief Description:
//Tests real-world constraint modeling.

class MovieTicket{
    String movieName;
    int totalSeats;
    int availableSeats;
    MovieTicket(String movieName, int totalSeats) {
        this.movieName = movieName;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;

    }

    void bookTickets(int numberOfTickets) {
        if (numberOfTickets <= availableSeats) {
            availableSeats = availableSeats - numberOfTickets;
            System.out.println(numberOfTickets + " tickets booked successfully.");
        } else {
            System.out.println("Not enough seats available.");
        }
    }

    // Method to display available seats
    void displayAvailableSeats() {
        System.out.println("Available seats: " + availableSeats);
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {

        MovieTicket m1 = new MovieTicket("Dune" , 50);
        m1.displayAvailableSeats();
        m1.bookTickets(5);

        m1.displayAvailableSeats();


    }
}
