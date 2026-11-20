package module10.activity;

//Create AbstractActivity class
public class AbstractActivity {

    public static void main(String[] args) {
        //Create employee object
        Employee myEmployee = new Employee();

        //Call introduce() from employee
        myEmployee.setName("Katya");
        myEmployee.setAge(20);
        myEmployee.setJobTitle("Administrator");
        myEmployee.setCompany("Baltic Beach");
        myEmployee.setSalary(1500);

        myEmployee.introduce();

        //Create student object
        Student myStudent = new Student();

        //Call introduce() from student
        myStudent.setName("Katya");
        myStudent.setAge(20);
        myStudent.setSchoolName("TSI");

        myStudent.introduce();

    }
}
