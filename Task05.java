package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;

public class Task05 {
    //Сортировка вставками (Insertion Sort)
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

        for (int left = 0; left < arr.length; left++) {
            int value = arr[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < arr[i]) {
                    arr[i + 1] = arr[i];
                } else {
                    break;
                }
            }
            arr[i + 1] = value;
        }
        System.out.println("Sorted array:\t\t ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4d ", arr[i]);
        }
        System.out.println();
    }
}
