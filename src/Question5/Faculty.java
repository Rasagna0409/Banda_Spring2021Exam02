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
public class Faculty extends Employee{
    public int Officehours;
    public int numberofteachingsubjects;

    public Faculty(int Officehours, int numberofteachingsubjects, String Office, double Salary, int datehired, String Name, String Address, int PhoneNumber, String Emailaddress) {
        super(Office, Salary, datehired, Name, Address, PhoneNumber, Emailaddress);
        this.Officehours = Officehours;
        this.numberofteachingsubjects = numberofteachingsubjects;
    }

    public int getOfficehours() {
        return Officehours;
    }

    public int getNumberofteachingsubjects() {
        return numberofteachingsubjects;
    }

  

    @Override
    public String toString() {
        return super.toString()+"\n"+"Faculty{" + "Officehours=" + Officehours + ", numberofteachingsubjects=" + numberofteachingsubjects + '}';
    }
    
    
}
