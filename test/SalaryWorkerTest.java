import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {
    SalaryWorker sw1, sw2, sw3, sw4, sw5, sw6;
    @BeforeEach
    void setUp()
    {
        sw1 = new SalaryWorker("00000A", "Bob", "Tester1", "Mr.", 1955, 0, 1560);
        sw2 = new SalaryWorker("00000B", "Sally", "Tester2", "Mrs.", 1975, 0, 52000);
        Person.setIDSeed(0);
        sw3 = new SalaryWorker("Bob", "Tester3", "Mr.", 1960, 0, 5200);
        sw4 = new SalaryWorker( "Sally", "Tester4", "Ms.", 1965, 0, 10400);
        sw5 = new SalaryWorker( "Fred", "Tester5", "Mr.", 1970, 0, 1040);
        sw6 = new SalaryWorker( "Cindy", "Tester6", "Mrs.", 1975, 0, 520);
    }
    @Test
    void setAnnualSalary()
    {
        sw1.setAnnualSalary(520);
        assertEquals(520, sw1.getAnnualSalary());
    }

    @Test
    void calculateWeeklyPay()
    {
        sw3.setAnnualSalary(5200);
        int hoursWorked = 0;
        assertEquals(100, sw3.calculateWeeklyPay(hoursWorked));
    }

    @Test
    void displayWeeklyPay()
    {
        sw2.setAnnualSalary(52000);
        String resultingString = "Weekly Pay: 1000.0. Annual Salary: 52000.0.";
        assertEquals(resultingString, sw2.displayWeeklyPay(0));
    }
}