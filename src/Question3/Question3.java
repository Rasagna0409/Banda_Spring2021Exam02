/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author S542264
 */
public class Question3 {

    public static void main(String args[]) {
        List<Object> al = new ArrayList<>();
        al.add(new Loan(1000));
        al.add(new Date());
        al.add(new String("Rasagna"));
        al.add(new Circle(10));

        Iterator it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }

    }
}
