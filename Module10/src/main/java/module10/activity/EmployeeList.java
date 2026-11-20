package module10.activity;

import java.util.ArrayList;
import java.util.List;

//Create EmployeeList class
public class EmployeeList {

    public static void main(String[] args) {

        //Create 5 employee objects using constructor of the Employee class
        Employee emp1 = new Employee("Katya", 20, "Administrator", "Baltic Beach", 1500);
        Employee emp2 = new Employee("Anna", 25, "Developer", "Accenture", 2000);
        Employee emp3 = new Employee("Robert", 28, "Waiter", "Gan Bei", 1250);
        Employee emp4 = new Employee("Nika", 18, "Cashier", "Maxima", 950);
        Employee emp5 = new Employee("Alex", 30, "Lawyer", "Luminor", 2500);

        //Create list
        List<Employee> empList = new ArrayList<>();

        //Add employee objects in the list
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);

        System.out.println("The Employee whose salary is the highest is: "
                + getHighestPaidEmp(empList));

    }

    //Create method which returns the name of the employee whose salary is highest among the 5
    public static String getHighestPaidEmp(List<Employee> empList) {
        Employee highestPaid = empList.get(0);

        for (Employee emp : empList) {
            if (emp.getSalary() > highestPaid.getSalary()) {
                highestPaid = emp;
            }
        }

        return highestPaid.getName();
    }
}
