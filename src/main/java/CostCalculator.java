public class CostCalculator {

    public static double doTheStuff(double km, double fuelPrice, double litersTo100) {
        double fuelNeeded = (km / 100) * litersTo100;
        return fuelNeeded * fuelPrice;
    }
}
