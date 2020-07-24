package babysitter;

public class WageCalculator {

    int preBedTimeWage = 12;
    int preBedTimeEarnings;
    int bedTimeWage = 8;
    int bedTimeEarnings;
    int midnightWage = 16;
    int midnightEarnings;

    public int calculatePreBedTimeEarnings(int startingHour, int endingHour, int bedtime) {
        if (startingHour < bedtime && endingHour < bedtime) {
            return preBedTimeEarnings = preBedTimeWage * (endingHour - startingHour);
        } else {
            return preBedTimeEarnings = 0;
        }
    }

    public int calculateBedTimeEarnings(int startingHour, int endingHour, int bedtime) {
        if (endingHour > bedtime && endingHour <= 24) {
            return bedTimeEarnings = bedTimeWage * (endingHour - startingHour);
        } else {
            return bedTimeEarnings = 0;
        }
    }

    public int calculateMidnightEarnings(int startingHour, int endingHour, int bedtime) {
        if (endingHour > 24) {
            return midnightEarnings = midnightWage * (endingHour - startingHour);
        } else {
            return midnightEarnings = 0;
        }
    }
}

//    public int MidnightWage(int startingHour, int endingHour, int bedtime) {
//
//    }

//    public int calculateShiftWage(int startingHour, int endingHour, int bedtime) {
//        if (startingHour < bedtime && endingHour < bedtime) {
//            return wage = 12;
//        } else if (endingHour > bedtime && endingHour <= 24) {
//            return wage = 8;
//        } else if (endingHour > 24 ) {
//            return wage = 16;
//        }
//
//        else {
//            return 0;
//        }
//    }
//

//    (wages1*shiftonehours1)+(w2*s2)+{w3*s3)= totalPay}

