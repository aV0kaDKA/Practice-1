package ru.mirea.kvbo1.gurtovaya;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arrayA[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //№3,4
        System.out.printf("Сумма элементов массива = " + sumA(arrayA) +
                "\nCреднее арифметическое элементов массива = " + sredarif(arrayA));
        Scanner vvod = new Scanner(System.in);
        System.out.printf("\nВведите размер массива: ");
        int size = vvod.nextInt();
        System.out.printf("Введите элементы массива: ");
        int elements[] = new int[size];
        int i = 0;
        do {
            elements[i] = vvod.nextInt();
            i++;
        } while (i < size);
        i = 0;
        do {
            System.out.println(elements[i]);
            i++;
        } while (i < size);
        System.out.printf("\nМаксимальный элемент массива: " + Max(elements) +
                "\nМинимальный элемент: " + Min(elements));
    }

    public static int sumA(int[] sumMassive) {
        int sum = 0;
        for (int i = 0; i < sumMassive.length; i++) {
            sum = sum + sumMassive[i];
        }
        return sum;
    }
    public static double sredarif(int[] a) {
        return ((sumA(a) * 0.1) / a.length) * 10;
    }

    public static int Max(int[] vvodMassive) {
        int Max = vvodMassive[0], i = 1;
        do {
            if (vvodMassive[i] > Max) {
                Max = vvodMassive[i];
            }
            i++;
        } while (i < vvodMassive.length);
        return Max;
    }

    public static int Min(int[] vvodMassive) {
        int Min = vvodMassive[0], i = 1;
        do {
            if (vvodMassive[i] < Min) {
                Min = vvodMassive[i];
            }
            i++;
        } while (i < vvodMassive.length);
        return Min;
    }
}