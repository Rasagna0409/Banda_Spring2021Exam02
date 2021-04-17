/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author S542264
 */
public class Student extends Person {

    public String Grade;
    public String CLASS_STATUS = "Graduate";

    public Student(String Grade, String CLASS_STATUS, String Name, String Address, int PhoneNumber, String Emailaddress) {
        super(Name, Address, PhoneNumber, Emailaddress);
        this.Grade = Grade;
    }

    public String getGrade() {
        return Grade;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Student{" + "Grade=" + Grade + ", CLASS_STATUS=" + CLASS_STATUS + '}';
    }

}
