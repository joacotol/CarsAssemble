import java.rmi.activation.ActivationGroup;

public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        // Calculation for the theoretical amount of cars produced based on speed
        int totalCarsProduced = speed * 221;
        // Returns this variable for actual production rate
        double actualTotalProduced;
        if(speed >= 1 && speed <= 4) {
            actualTotalProduced = totalCarsProduced * 1.0;
        } else if(speed >= 5 && speed <= 8) {
            actualTotalProduced = totalCarsProduced * (90/100.0);
        } else if (speed == 9) {
            actualTotalProduced = totalCarsProduced * (80/100.0);
        } else if (speed == 10) {
            actualTotalProduced = totalCarsProduced * (77/100.0);
        } else {
            actualTotalProduced = 0.0;
        }

        return actualTotalProduced;


    }

    public int workingItemsPerMinute(int speed) {
        throw new UnsupportedOperationException("Please implement the AssemblyLine.workingItemsPerMinute() method");
    }

    public static void main(String[] args) {
        //double user = productionRatePerHour(6);
        //System.out.println(user);
    }
}

