package module10.activity;

//Create Student class
public class Student extends Person {

    //Create attribute
    String schoolName;

    //Getter for school name
    public String getSchoolName() {
        return schoolName;
    }

    //Setter for school name
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    //Override method introduce() of person class
    @Override
    void introduce() {
        System.out.println("I study in university " + schoolName);
    }
}
