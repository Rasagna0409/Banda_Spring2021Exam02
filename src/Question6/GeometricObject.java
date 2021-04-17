/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

/**
 *
 * @author S542264
 */
public abstract class GeometricObject {

    private String colour;
    private boolean filled;

    public GeometricObject(String colour, boolean filled) {
        super();
        this.colour = colour;
        this.filled = filled;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "colour=" + colour + "\nfilled=" + filled;
    }

    public abstract double getArea();

    public abstract double getPrimeter();
}
