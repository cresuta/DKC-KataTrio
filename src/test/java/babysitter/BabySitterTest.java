package babysitter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;


public class BabySitterTest {

    @Test
    public void oneHourPreBedTimeShouldPay12() {
        WageCalculator underTest = new WageCalculator();
        int preBedTimeEarnings = underTest.calculatePreBedTimeEarnings(19, 20, 20);
        assertThat(preBedTimeEarnings).isEqualTo(12);
    }

    @Test
    public void twoHoursPreBedTimeShouldPay24() {
        WageCalculator underTest = new WageCalculator();
        int preBedTimeEarnings = underTest.calculatePreBedTimeEarnings(19, 21, 21);
        assertThat(preBedTimeEarnings).isEqualTo(24);
    }

    @Test
    public void threeHoursPreBedTimeShouldPay36() {
        WageCalculator underTest = new WageCalculator();
        int preBedTimeEarnings = underTest.calculatePreBedTimeEarnings(19, 23, 22);
        assertThat(preBedTimeEarnings).isEqualTo(36);
    }
    @Test
    public void oneHourBetweenBedTimeAndMidnightShouldPay8() {
        WageCalculator underTest = new WageCalculator();
        int bedTimeWage = underTest.calculateBedTimeEarnings(20, 21, 20);
        assertThat(bedTimeWage).isEqualTo(8);
    }

    @Test
    public void twoHoursBetweenBedTimeAndMidnightShouldPay16() {
        WageCalculator underTest = new WageCalculator();
        int bedTimeWage = underTest.calculateBedTimeEarnings(20,22, 20);
        assertThat(bedTimeWage).isEqualTo(16);
    }

    @Test
    public void oneHourPostMidnightShouldPay16() {
        WageCalculator underTest = new WageCalculator();
        int midnightWage = underTest.calculateMidnightEarnings(24,25, 20);
        assertThat(midnightWage).isEqualTo(16);
    }

    @Test
    public void twoHoursPostMidnightShouldPay32() {
        WageCalculator underTest = new WageCalculator();
        int midnightWage = underTest.calculateMidnightEarnings(24,26,20);
        assertThat(midnightWage).isEqualTo(32);
    }

    @Test
    public void totalPayShouldBe36() {
        WageCalculator underTest = new WageCalculator();
        int totalPay = underTest.calculateTotalEarnings(22, 25, 23);
        assertThat(totalPay).isEqualTo(36);
    }
//    @Test
//    public void calculateShiftWages() {
//        WageCalculator underTest = new WageCalculator();
//        int totalPay = underTest.calculateNightlyEarnings()
//    }
}
