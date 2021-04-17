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
public class Triangle extends GeometricObject {

    private double s1;
    private double s2;
    private double s3;

    public Triangle(String colour, boolean filled, double s1, double s2, double s3) {
        super(colour, filled);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        setColour(colour);
        setFilled(filled);
    }

    public double getS1() {
        return s1;
    }

    public void setS1(double s1) {
        this.s1 = s1;
    }

    public double getS2() {
        return s2;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }

    public double getS3() {
        return s3;
    }

    public void setS3(double s3) {
        this.s3 = s3;
    }

    public Triangle(String colour, boolean filled) {
        super(colour, filled);

    }

    @Override
    public double getArea() {

        double s = (s1 + s2 + s3) / 2;
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));

    }

    @Override
    public double getPrimeter() {

        return s1 + s2 + s3;
    }

    @Override
    public String toString() {
        return super.toString() + "\nArea: " + getArea()
                + "\nPerimeter: " + getPrimeter();
    }

}
