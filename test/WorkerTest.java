import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest
{
    Worker w1, w2, w3, w4, w5, w6;
    @BeforeEach
    void setUp()
    {
        w1 = new Worker("00000A", "Bob", "Tester1", "Mr.", 1955, 50);
        w2 = new Worker("00000B", "Sally", "Tester2", "Mrs.", 1975, 30);
        Person.setIDSeed(0);
        w3 = new Worker("Bob", "Tester3", "Mr.", 1960, 40);
        w4 = new Worker( "Sally", "Tester4", "Ms.", 1965, 60);
        w5 = new Worker( "Fred", "Tester5", "Mr.", 1970, 20);
        w6 = new Worker( "Cindy", "Tester6", "Mrs.", 1975, 15);
    }
    @Test
    void setHourlyPayRate()
    {
        w1.setHourlyPayRate(20);
        assertEquals(20, w1.getHourlyPayRate());
    }
    @Test
    void calculateWeeklyPay()
    {
        w3.setHourlyPayRate(50);
        int hoursWorked = 45;
        assertEquals(2375, w3.calculateWeeklyPay(hoursWorked));
    }

    @Test
    void displayWeeklyPay()
    {
        w2.setHourlyPayRate(50);
        int hoursWorked = 45;
        String resultingString = "Hours of regular pay: 40.0. Regular pay: 2000.0. Overtime Hours: 5.0. Overtime pay: 375.0. Total hours: 45.0. Total pay: 2375.0.";
        assertEquals(resultingString, w2.displayWeeklyPay(hoursWorked));
    }
}