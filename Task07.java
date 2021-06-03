package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Define array rows/columns > ");
        n = sc.nextInt();

        int[][] arr = new int[n][n];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(10);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("[%4d]", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Array diagonal elements are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%4d]", arr[i][i]);
        }
    }
}
