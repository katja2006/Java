package module10.activity;

//Create Person class
abstract class Person {

    //Create attributes
    String name;
    int age;

    //Getter for name
    public String getName() {
        return name;
    }

    //Setter for name
    public void setName(String name) {
        this.name = name;
    }

    //Getter for age
    public int getAge() {
        return age;
    }

    //Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    //Define introduce() method
    void introduce() {
        System.out.println("My name is " + name + " and I am " + age);
    }
}
