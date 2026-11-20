package module10.activity;

//Create Employee class
public class Employee extends Person {

    //Create attributes
    String jobTitle;
    String company;
    float salary;

    //Constructor for job title
    public Employee(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    //Default constructor
    public Employee() {
    }

    //Constructor for name, age, job title, company and salary
    public Employee(String name, int age, String jobTitle, String company, float salary){
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }


    //Getter for job title
    public String getJobTitle() {
        return jobTitle;
    }

    //Setter for job title
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    //Getter for company
    public String getCompany() {
        return company;
    }

    //Setter for company
    public void setCompany(String company) {
        this.company = company;
    }

    //Getter for salary
    public float getSalary() {
        return salary;
    }

    //Setter for salary
    public void setSalary(float salary) {
        this.salary = salary;
    }

    //Override method introduce() of person class
    @Override
    void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old");
        System.out.println("I work as " + jobTitle + " in " + company + " and my salary is " + salary);
    }
}
