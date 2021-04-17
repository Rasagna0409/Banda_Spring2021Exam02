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
public class Loan {

    int amount;

    public Loan(int amount) {
        super();
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Loan amount is " + amount;
    }

}
