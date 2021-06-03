package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;

public class Task02 {
    //Дана последовательность чисел а1 ,а2 ,..., ап. 
    //Указать наименьшую длину числовой оси, содержащую все эти числа.
    public static void main(String[] args) {
//        int[] arr = new int[]{3, 1, -9, 7}; //for testing

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

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println();
        System.out.printf("min = %2d \n", min);
        System.out.printf("max = %2d \n", max);
        System.out.printf("length = %2d \n", max - min);
    }
}

