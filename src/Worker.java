import java.sql.SQLOutput;

public class Worker extends Person
{
    private double hourlyPayRate;

    public double getHourlyPayRate()
    {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate)
    {
        this.hourlyPayRate = hourlyPayRate;
    }

    public Worker(String ID, String firstName, String lastName, String title, int yearOfBirth, double hourlyPayRate)
    {
        super(ID, firstName, lastName, title, yearOfBirth);
        this.hourlyPayRate = hourlyPayRate;
    }

    public Worker(String firstName, String lastName, String title, int yearOfBirth, double hourlyPayRate)
    {
        super(firstName, lastName, title, yearOfBirth);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked)
    {
        double totalPay = 0;
        double regularPay = 0;
        double regularHours = 0;
        double overtimeHours = 0;
        double overtimePay = 0;
        if (hoursWorked <= 40)
        {
            regularPay = hoursWorked * hourlyPayRate;
        }
        else if (hoursWorked > 40)
        {
            regularHours = 40;
            regularPay = regularHours * hourlyPayRate;
            overtimeHours = hoursWorked - 40;
            overtimePay = (overtimeHours * hourlyPayRate * 1.5);
        }
        totalPay = regularPay + overtimePay;
        return totalPay;
    }

    public String displayWeeklyPay(double hoursWorked)
    {
        double totalPay = 0;
        double regularPay = 0;
        double regularHours = 0;
        double overtimeHours = 0;
        double overtimePay = 0;
        if (hoursWorked <= 40)
        {
            regularHours = hoursWorked;
            regularPay = hoursWorked * hourlyPayRate;
        }
        else if (hoursWorked > 40)
        {
            regularHours = 40;
            regularPay = regularHours * hourlyPayRate;
            overtimeHours = hoursWorked - 40;
            overtimePay = (overtimeHours * hourlyPayRate * 1.5);
        }
        totalPay = regularPay + overtimePay;
        String payDisplay = "";
        payDisplay = "Hours of regular pay: " + regularHours + ". Regular pay: " + regularPay + ". Overtime Hours: " + overtimeHours + ". Overtime pay: " + overtimePay + ". Total hours: " + hoursWorked + ". Total pay: " + totalPay + ".";
        System.out.println(payDisplay);
        return payDisplay;
    }
}
