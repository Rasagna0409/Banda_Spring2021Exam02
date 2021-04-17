/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

/**
 *
 * @author S542264
 */
import java.io.*;
import java.util.*;

public class EnumsExample {

    enum Shirts {
        BLACK, RED, WHITE, YELLOW, BLUE;
    }

    public static void main(String args[]) {

        Shirts color = Shirts.RED;

        System.out.println("On Tuesday, I Wear " + color + " color shirt");
    }

}


