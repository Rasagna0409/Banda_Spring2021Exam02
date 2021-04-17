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
import java.util.Scanner;

public class Question6Driver {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides of the triangle: ");
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();
        System.out.print("Enter a color: ");

        String color = sc.next();
        System.out.print("Is the triangle filled (true / false)? ");
        boolean filled = sc.nextBoolean();
        Triangle triangle = new Triangle(color, filled, s1, s2, s3);
        System.out.println(triangle);
    }

}
