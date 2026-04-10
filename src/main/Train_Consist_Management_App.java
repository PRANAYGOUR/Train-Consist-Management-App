import java.util.*;

public class Train_Consist_Management_App {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC16 - Bubble Sort (Passenger Capacity) ");
        System.out.println("==============================================\n");

        // Passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting:");
        printArray(capacities);

        // 🔥 Bubble Sort Logic
        for (int i = 0; i < capacities.length - 1; i++) {
            for (int j = 0; j < capacities.length - i - 1; j++) {

                if (capacities[j] > capacities[j + 1]) {
                    // swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.println("\nAfter Sorting:");
        printArray(capacities);

        System.out.println("\nUC16 sorting completed...");
    }

    // Helper method
    static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}