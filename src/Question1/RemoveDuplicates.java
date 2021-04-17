/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

/**
 *
 * @author Rasagna Reddy Banda
 */
import java.util.*;

public class RemoveDuplicates {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter Ten Integers: ");
        String[] arrItems = sc.nextLine().split(" ");

        for (int i = 0; i < 10; i++) {

            int listItems = Integer.parseInt(arrItems[i]);
            list.add(listItems);
        }
        removeDuplicate(list);
    }

    public static void removeDuplicate(ArrayList<Integer> list) {

        ArrayList<Integer> nal = new ArrayList<>();

        for (Integer i : list) {
            if (nal.contains(i)) {
                continue;
            } else {
                nal.add(i);
            }
        }
        System.out.println("The distinct integers are : ");
        for (Integer j : nal) {
            System.out.print(j + " ");
        }

    }
}
