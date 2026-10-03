import java.util.Scanner;

public class SolarEnergyMonitor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter energy generated
        System.out.print("Enter the energy generated in kWh: ");
        double energyGenerated = scanner.nextDouble();

        // Check the energy generation using if-else condition
        if (energyGenerated >= 10.0) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }

        scanner.close();
    }
}