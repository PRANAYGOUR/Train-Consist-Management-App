import java.util.*;

public class Train_Consist_Management_App {

    // ✅ Custom Runtime Exception
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // ✅ Goods Bogie class
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type) {
            this.type = type;
        }

        void assignCargo(String cargo) {
            try {
                // 🔥 Safety rule
                if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                    throw new CargoSafetyException("Unsafe cargo assignment!");
                }

                this.cargo = cargo;
                System.out.println("Cargo assigned successfully: " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Cargo assignment attempt completed.\n");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC15 - Safe Cargo Assignment ");
        System.out.println("==============================================\n");

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // ✅ Safe assignment
        b1.assignCargo("Petroleum");

        // ❌ Unsafe assignment
        b2.assignCargo("Petroleum");

        // Program continues
        b2.assignCargo("Coal");

        System.out.println("UC15 execution completed...");
    }
}