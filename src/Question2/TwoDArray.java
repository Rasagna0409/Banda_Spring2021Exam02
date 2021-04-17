/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

/**
 *
 * @author S542264
 */
import java.io.*;
import java.util.*;

public class TwoDArray {

    public static void main(String args[]) {
        int arr1[][] = new int[3][3];
        int arr2[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter list1:");

        for (int i = 0; i < 3; i++) {

            String[] arr1Items = sc.nextLine().split(" ");
            //sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {

                int arr1I = Integer.parseInt(arr1Items[j]);
                arr1[i][j] = arr1I;

            }
        }
        System.out.println("Enter list2:");
        for (int i = 0; i < 3; i++) {

            String[] arr2Items = sc.nextLine().split(" ");
            //sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int arr2I = Integer.parseInt(arr2Items[j]);
                arr2[i][j] = arr2I;

            }
        }
        if (equals(arr1, arr2)) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }

    }

    public static boolean equals(int[][] m1, int[][] m2) {
        boolean ans = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m1[i][j] != m2[i][j]) {
                    ans = false;
                    return ans;
                }
            }
        }
        return ans;

    }
}
