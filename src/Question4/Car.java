/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;

import java.io.*;
import java.util.*;

/**
 *
 * @author S542264
 */
public class Car {

    public int gears;
    public int tyres;

    public Car(int gears, int tyres) {
        super();
        this.gears = gears;
        this.tyres = tyres;
    }

    @Override
    public String toString() {
        return " Along with " + gears + " gears," + tyres + " tyres";
    }

}
