import java.util.*;

public class Train_Consist_Management_App {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC19 - Binary Search ");
        System.out.println("==============================================\n");

        String[] bogieIds = {"BG101","BG205","BG309","BG412","BG550"};

        String key = "BG309";

        boolean found = binarySearch(bogieIds, key);

        if (found) {
            System.out.println("Bogie Found: " + key);
        } else {
            System.out.println("Bogie Not Found: " + key);
        }

        System.out.println("\nUC19 completed...");
    }

    // 🔥 Binary Search
    static boolean binarySearch(String[] arr, String key) {

        Arrays.sort(arr); // ensure sorted

        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int cmp = arr[mid].compareTo(key);

            if (cmp == 0) return true;
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }

        return false;
    }
}