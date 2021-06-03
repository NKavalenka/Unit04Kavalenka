package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;

public class Task04 {
    // Bubble Sort DESC
    public static void main(String[] args) {
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

        System.out.println();
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println("Array sorted Desc:\t\t ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4d ", arr[i]);
        }
        System.out.println();
    }
}
