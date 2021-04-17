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
public class Person {
    
    public String Name;
    public String Address;
    public int PhoneNumber;
    public String Emailaddress;

    public Person(String Name, String Address, int PhoneNumber, String Emailaddress) {
        this.Name = Name;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
        this.Emailaddress = Emailaddress;
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
        return "Person{" + "Name=" + Name + ", Address=" + Address + ", PhoneNumber=" + PhoneNumber + ", Emailaddress=" + Emailaddress + '}';
    }
    
    
    
}
