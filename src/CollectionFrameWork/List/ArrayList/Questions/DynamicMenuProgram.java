package CollectionFrameWork.List.ArrayList.Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicMenuProgram {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <=list.size(); i++) {

            System.out.println("Select an Option from menu");
        System.out.println("1."+"Add element");
        System.out.println("2."+"Remove element");
        System.out.println("3."+"Display list");
        System.out.println("4."+"Exit");
        System.out.print("Enter your choice: ");

        int Enter  = sc.nextInt();

    if (Enter == 1) {
        System.out.println("Enter element to add in list:");
        int add = sc.nextInt();
        list.add(add);
        System.out.println("✅ Element added successfully!");
        System.out.println("Current List: " + list);

    } else if (Enter == 2) {
        System.out.println("Enter element to remove from list");
        int remove = sc.nextInt();
        list.remove(remove);
        System.out.println("❌ Element removed successfully!");
    }  else if (Enter == 3) {
        System.out.println("📜 Current List: " + list);
    } else if (Enter == 4) {
        System.out.println("👋 Exiting Program...");
        break;
    }
}
    }
}
