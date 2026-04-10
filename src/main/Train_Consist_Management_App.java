import java.util.*;

public class Train_Consist_Management_App {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC18 - Linear Search (Bogie ID) ");
        System.out.println("==============================================\n");

        // Bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        String searchKey = "BG309"; // change to test

        boolean found = false;

        // 🔥 Linear Search
        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break; // stop early
            }
        }

        // Output
        if (found) {
            System.out.println("Bogie Found: " + searchKey);
        } else {
            System.out.println("Bogie Not Found: " + searchKey);
        }

        System.out.println("\nUC18 search completed...");
    }
}