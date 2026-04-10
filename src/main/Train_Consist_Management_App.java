import java.util.*;

public class Train_Consist_Management_App {

    // Goods Bogie class
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC12 - Safety Compliance Check ");
        System.out.println("==============================================\n");

        // Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        // 🔥 Safety validation using allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );

        // Output result
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ");
        } else {
            System.out.println("Train is NOT SAFE ");
        }

        System.out.println("\nUC12 safety validation completed...");
    }
}