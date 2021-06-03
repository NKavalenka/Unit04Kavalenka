package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;

public class Task01 {
    // Дана последовательность натуральных чисел а1 , а2 ,..., ап. 
    // Создать массив из четных чисел этой последовательности. 
    // Если таких чисел нет, то вывести сообщение об этом факте
    public static void main(String[] args) {
//        int[] arr = new int[]{1, 6, 3, 8};//for testing
        int counter = 0;

        Scanner sc = new Scanner(System.in);
        int n;
        int[] arr;
        System.out.print("Define array length > ");
        n = sc.nextInt();

        arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }


        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%2d]", arr[i]);
        }

        System.out.println("\nArray of even numbers:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.printf("[%2d]", arr[i]);
                counter++;
                if (counter == 0) {
                    System.out.println("No even numbers");
                }
            }
        }
    }
}
