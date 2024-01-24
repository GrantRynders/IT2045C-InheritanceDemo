import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{

    public static void main(String[] args)
    {
        Worker w1, w2, w3;
        SalaryWorker sw1, sw2, sw3;
        w1 = new Worker("00000A", "Bob", "Tester1", "Mr.", 1955, 50);
        w2 = new Worker("00000B", "Sally", "Tester2", "Mrs.", 1975, 30);
        w3 = new Worker("Bob", "Tester3", "Mr.", 1960, 40);
        sw1 = new SalaryWorker( "Sally", "Tester4", "Ms.", 1965, 2.5,5200); // yeah these really aren't all that accurate lol
        sw2 = new SalaryWorker( "Fred", "Tester5", "Mr.", 1970, 5, 10400);
        sw3 = new SalaryWorker( "Cindy", "Tester6", "Mrs.", 1975, 7.5,15600);

        ArrayList<Worker> workers = new ArrayList<Worker>();
        workers.add(w1);
        workers.add(w2);
        workers.add(w3);
        workers.add(sw1);
        workers.add(sw2);
        workers.add(sw3);

        System.out.format("%4s%10s%9s%12s\n", "ID#", "Firstname", "Lastname", "Weekly Pay");
        System.out.format("%16s\n", "============= Week 1 =============");
        for (Worker w: workers)
        {
            System.out.format("%16s\n", w.getID() + "  " + w.getFirstName() + "  " + w.getLastName() + "  " + w.calculateWeeklyPay(40));
        }
        System.out.format("%16s\n", "============= Week 2 =============");
        for (Worker w: workers)
        {
            System.out.format("%16s\n", w.getID() + "  " + w.getFirstName() + "  " + w.getLastName() + "  " + w.calculateWeeklyPay(50));
        }
        System.out.format("%16s\n", "============= Week 3 =============");
        for (Worker w: workers)
        {
            System.out.format("%16s\n", w.getID() + "  " + w.getFirstName() + "  " + w.getLastName() + "  " + w.calculateWeeklyPay(40));
        }
    }
}