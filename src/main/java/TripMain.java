import java.util.Scanner;

public class TripMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your car fuel consumption: ");
        double litersPer100 = scanner.nextDouble();

        System.out.print("Enter the distance to travel in km: ");
        double distance = scanner.nextDouble();

        System.out.print("Enter the fuel price per liter: ");
        double fuelPricePerLiter = scanner.nextDouble();

        double totalCost = CostCalculator.doTheStuff(distance, litersPer100, fuelPricePerLiter);

        System.out.printf("Total cost of the trip: €%.2f%n", totalCost);

    }
}
