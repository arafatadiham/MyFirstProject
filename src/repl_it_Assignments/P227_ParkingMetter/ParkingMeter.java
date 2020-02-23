package repl_it_Assignments.P227_ParkingMetter;

public class ParkingMeter {

    int timeLeft = 0;
    int maxTime;

    public ParkingMeter(int maxTime) {
        this.maxTime = maxTime;
    }

    public boolean add(int firstParameter) {

        if (firstParameter == 25) {
            timeLeft += 30;

            return true;
        } else if (timeLeft > maxTime || firstParameter != 25) {

        }
       return false;
    }

    public void tick() {

        if (timeLeft > 0) {
            timeLeft--;
        }
    }

    public boolean isExpired() {

        if (timeLeft == 0) {

            return true;
        }
        return false;
    }
}