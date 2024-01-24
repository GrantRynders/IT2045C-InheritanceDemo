import java.time.Year;

public class Person
{


    //                  VARIABLES


    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int yearOfBirth;

    static private int IDSeed =  1;


    //                  CONSTRUCTORS


    public static void setIDSeed(int IDSeed)
    {
        Person.IDSeed = IDSeed;
    }

    public static int getIDSeed()
    {
        return IDSeed;
    }

    private String genIDNum() {
        String newID = "" + IDSeed;
        while(newID.length() < 6)
        {
            newID = "0" + newID;
        }

        IDSeed++;

        return newID;
    }

    public Person(String ID, String firstName, String lastName, String title, int yearOfBirth) //PERSON CONSTRUCTOR WITH CUSTOMER ID
    {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.yearOfBirth = yearOfBirth;

    }
    public Person(String firstName, String lastName, String title, int yearOfBirth) // PERSON CONSTRUCTOR WITH AUTOMATIC ID GENERATION
    {
        this.ID = this.genIDNum();
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.yearOfBirth = yearOfBirth;
    }

    //                  GETTERS AND SETTERS


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }


    //                  FUNCTIONS


    public static void main(String[] args)
    {

    }
    public String fullName(String firstName, String lastName) // returns firstName, space, lastName
    {
        //String fullName = firstName.concat(" ").concat(lastName);
        String fullName = firstName + " " + lastName;
        return fullName;
    }
    public String formalName(String title, String firstName, String lastName) // returns title, space, fullName
    {
        //String formalName = title.concat(" ").concat(fullName(firstName, lastName));
        String formalName = title + " " + fullName(firstName, lastName);
        return formalName;
    }
    public String getAge() // returns the age assuming the current year
    {
        int age = Year.now().getValue() - yearOfBirth;
        return String.valueOf(age);
    }
    public String getAge(int year) // uses YOB to calculate age for a specified year
    {
        int age = year - yearOfBirth;
        return String.valueOf(age);
    }
    public String toCSVRecord()
    {
        return  this.ID + ", " + this.firstName + ", " + this.lastName + ", " + title + ", " + yearOfBirth;
    }
}