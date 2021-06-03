package by.epam.unit04.main;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Define array rows/columns > ");
        n = sc.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0 || i == 0 || j == arr[i].length - 1 || i == arr.length - 1) {
                    arr[i][j] = 1;
                }

            }

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("[%4d]", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}