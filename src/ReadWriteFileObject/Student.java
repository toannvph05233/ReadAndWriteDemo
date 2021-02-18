package ReadWriteFileObject;

import java.io.Serializable;

public class Student implements Serializable{
    private String firstName;
    private String lastName;
    private int age;

    public Student(){}

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "first" + firstName +","+ "lastName"+ lastName+","+"age"+age;
    }
}
