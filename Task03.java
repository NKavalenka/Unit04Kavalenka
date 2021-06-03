package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;

public class Task03 {
    //Дан массив действительных чисел, размерность которого N. 
    //Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
    public static void main(String[] args) {
        int countPositiveNumbers = 0;
        int countZero = 0;
        int countNegativeNumbers = 0;


        Scanner sc = new Scanner(System.in);
        int n;
        int[] arr;

        System.out.print("Define array length > ");
        n = sc.nextInt();

        arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -100 + rand.nextInt(100 - (-100));
        }
        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%2d]", arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZero++;
            }
            if (arr[i] > 0) {
                countPositiveNumbers++;
            }
            if (arr[i] < 0) {
                countNegativeNumbers++;
            }
        }
        System.out.println();
        System.out.println("Amount of zeros in array is " + countZero);
        System.out.println("Amount of positive numbers in array is " + countPositiveNumbers);
        System.out.println("Amount of negative numbers in array is " + countNegativeNumbers);

    }
}

