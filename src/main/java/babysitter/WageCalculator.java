package babysitter;

public class WageCalculator {
    int wage;

    public int calculateShiftWage(int startingHour, int endingHour, int bedtime) {
        if (startingHour < bedtime) {
            return wage = 12;
        } else {
            return 0;
        }
    }
}
