package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;

public class Task08 {
    //Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int m;

        System.out.print("Define array rows > ");
        n = sc.nextInt();
        System.out.print("Define array columns > ");
        m = sc.nextInt();

        int[][] arr = new int[n][m];
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

        int k;
        int p;

        System.out.print("Define k > ");
        k = sc.nextInt();
        System.out.print("Define p > ");
        p = sc.nextInt();

        System.out.println("The row number " + k + " is:");
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (i == k) {
                    System.out.printf("[%3d]", arr[i][j]);
                }
            }
        }
        System.out.println();
        System.out.println("The column number " + p + " is:");
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (j == p) {
                    System.out.printf("[%3d]\n", arr[i][j]);
                }
            }
        }
    }
}
