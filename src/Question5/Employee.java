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
public class Employee extends Person{
    
    public String Office;
    public double Salary;
    public int datehired;

    public Employee(String Office, double Salary, int datehired, String Name, String Address, int PhoneNumber, String Emailaddress) {
        super(Name, Address, PhoneNumber, Emailaddress);
        this.Office = Office;
        this.Salary = Salary;
        this.datehired = datehired;
    }

    public String getOffice() {
        return Office;
    }

    public double getSalary() {
        return Salary;
    }

    public int getDatehired() {
        return datehired;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public String getEmailaddress() {
        return Emailaddress;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Employee{" + "Office=" + Office + ", Salary=" + Salary + ", datehired=" + datehired + '}';
    }
    
}
