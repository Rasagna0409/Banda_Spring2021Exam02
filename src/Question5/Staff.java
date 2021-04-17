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
public class Staff extends Employee {

    public String Title;

    public Staff(String Title, String Office, double Salary, int datehired, String Name, String Address, int PhoneNumber, String Emailaddress) {
        super(Office, Salary, datehired, Name, Address, PhoneNumber, Emailaddress);
        this.Title = Title;
    }

    public String getTitle() {
        return Title;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Staff{" + "Title=" + Title + '}';
    }

}
