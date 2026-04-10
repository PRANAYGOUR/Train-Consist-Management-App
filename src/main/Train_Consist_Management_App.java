import java.util.*;

public class Train_Consist_Management_App {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC20 - Exception Handling in Search ");
        System.out.println("==============================================\n");

        String[] bogieIds = {}; // empty case

        String key = "BG101";

        try {
            boolean result = searchWithValidation(bogieIds, key);

            if (result) {
                System.out.println("Bogie Found: " + key);
            } else {
                System.out.println("Bogie Not Found: " + key);
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC20 completed...");
    }

    // 🔥 Fail-fast validation
    static boolean searchWithValidation(String[] arr, String key) {

        if (arr.length == 0) {
            throw new IllegalStateException("No bogies available for search!");
        }

        for (String id : arr) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }
}