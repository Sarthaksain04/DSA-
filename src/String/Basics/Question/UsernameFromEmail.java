package String.Basics.Question;

import java.util.Scanner;

public class UsernameFromEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the email:");
        String  email = sc.nextLine();
        for (int i = 0; i <email.length() ; i++) {
            if(email.charAt(i) == '@'){
                // Find index of '@'
                int atIndex = email.indexOf('@');
                System.out.println(email.substring(0 , atIndex));
            }
        }

    }
}
