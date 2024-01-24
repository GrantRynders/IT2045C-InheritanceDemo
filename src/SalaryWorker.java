public class SalaryWorker extends Worker
{
    public double getAnnualSalary()
    {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary)
    {
        this.annualSalary = annualSalary;
    }

    private double annualSalary = 0;

    public SalaryWorker(String ID, String firstName, String lastName, String title, int yearOfBirth, double hourlyPayRate, double annualSalary)
    {
        super(ID, firstName, lastName, title, yearOfBirth, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public SalaryWorker(String firstName, String lastName, String title, int yearOfBirth, double hourlyPayRate, double annualSalary)
    {
        super(firstName, lastName, title, yearOfBirth, hourlyPayRate);
        this.annualSalary = annualSalary;
    }
    public double calculateWeeklyPay(double hoursWorked)
    {
        double weeklyPay = annualSalary / 52;
        return weeklyPay;
    }
    public String displayWeeklyPay(double hoursWorked)
    {
        String displayString = "Weekly Pay: " + calculateWeeklyPay(0) + ". Annual Salary: " + annualSalary + ".";
        return displayString;
    }
}
