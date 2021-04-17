/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4.Polymorphism;

/**
 *
 * @author S542264
 */
public class Dining {

    public void seats(int noOfSeats) {

        System.out.println("Dining table has " + noOfSeats + " seats");

    }

    public void seats(int noOfSeats, int noOfPlates) {

        System.out.println("Dining table has " + noOfSeats + " seats with " + noOfPlates + " plates");

    }

}
