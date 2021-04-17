/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;

/**
 *
 * @author S542264
 */
public class Mercedes extends Car {

    public int seats;

    public Mercedes(int gears, int tyres, int seats) {
        super(gears, tyres);
        this.seats = seats;
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return super.toString() + " Mercede has " + seats + " seats";
    }

}
