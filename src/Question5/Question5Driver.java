/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

import java.util.Scanner;

/**
 *
 * @author S542264
 */
public class Question5Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        //sc.next();
        System.out.println("Enter Name: ");
        String Name=sc.nextLine();
        System.out.println("Enter Address: ");
        String Address=sc.nextLine();
        System.out.println("Enter PhoneNumber: ");
        int PhoneNumber=sc.nextInt();
        System.out.println("Enter Emailaddress: ");
        String Emailaddress=sc.next();
        Person obj1=new Person(Name, Address, PhoneNumber, Emailaddress);
        System.out.println("Enter Office:");
        String Office=sc.next();
        System.out.println("Enter Salary:");
        double Salary=sc.nextDouble();
        System.out.println("Enter datehired:");
        int datehired=sc.nextInt();
        Employee obj2=new Employee(Office, Salary, datehired,Name,Address,PhoneNumber, Emailaddress);
        System.out.println("Enter Officehours: ");
        int Officehours=sc.nextInt();
        System.out.println("Enter numberofteachingsubjects:");
        int numberofteachingsubjects=sc.nextInt();
        Faculty obj3=new Faculty(Officehours,numberofteachingsubjects,Office, Salary, datehired,Name,Address,PhoneNumber, Emailaddress);
        System.out.println("Enter Grade: ");
        String Grade=sc.next();
        System.out.println("Enter CLASS_STATUS");
        String CLASS_STATUS=sc.nextLine();
        Student obj4=new Student(Grade, CLASS_STATUS,Name, Address, PhoneNumber, Emailaddress);
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);        
        
    }
    
}
