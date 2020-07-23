package babysitter;

public class WageCalculator {
    int wage;

    public int calculateShiftWage(int startingHour, int endingHour, int bedtime) {
        if (startingHour < bedtime && endingHour < bedtime) {
            return wage = 12;
        } else if (endingHour > bedtime && endingHour <= 24) {
            return wage = 8;
        } else if (endingHour > 24 ) {
            return wage = 16;
        }

        else {
            return 0;
        }
    }
}
