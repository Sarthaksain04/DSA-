package String.Basics.Question;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Q3 {
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
