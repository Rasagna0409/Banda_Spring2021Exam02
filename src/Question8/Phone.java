/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

/**
 *
 * @author S542264
 */
public abstract class Phone {

    int batteries = 1;

    @Override
    public String toString() {
        return " and has " + batteries + " battery";
    }

    public void noOfBatteries() {
        System.out.println("It has 1  Battery");
    }

    public abstract void nofOfCameras();

}
