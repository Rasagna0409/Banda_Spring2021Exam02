/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author S542264
 */
public class Circle {

    int radius;

    @Override
    public String toString() {
        return "Circle has radius of " + radius + "cm";
    }

    public Circle(int radius) {
        super();
        this.radius = radius;
    }

}
