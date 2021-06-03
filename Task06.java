package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;

public class Task06 {
    //Дан двухмерный массив n×m элементов.
    // Определить, сколько раз встречается число 7 среди элементов массива
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

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.println("count 7 = " + count);
    }
}
