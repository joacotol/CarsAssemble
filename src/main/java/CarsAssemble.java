import java.rmi.activation.ActivationGroup;

// Create class called CarsAssemble
public class CarsAssemble {

    // Create a method that will calculate the production rate / hour
    public double productionRatePerHour(int speed) {
        // Calculation for the theoretical amount of cars produced based on speed
        int totalCarsProduced = speed * 221;
        // Returns this variable for actual production rate
        double actualTotalProduced;
        
        // Checks if the speed variable fits in one of the conditional statements
        if(speed >= 1 && speed <= 4) {
            // Calcaulates the actual amount produced based on the success rate
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

    // Create a method that will calculate the number working items per 
    // minute using the method productionRatePerHour();
    public int workingItemsPerMinute(int speed) {
        int itemsPerHour = (int)productionRatePerHour(speed);
        //Calculate the items per minute that is produced based on the variable itemsPerHour
        int itemsPerMinute = itemsPerHour / 60;
        return itemsPerMinute;
    }
}

