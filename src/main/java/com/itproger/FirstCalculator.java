// Первый калькулятор
package com.itproger;

import java.util.Scanner;

public class FirstCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите 1 число: ");
        float num1 = scan.nextFloat();

        System.out.println("Введите 2 число: ");
        float num2 = scan.nextFloat();

        float res1 = num1 + num2;
        float res2 = num1 - num2;
        float res3 = num1 * num2;
        float res4 = num1 / num2;

        System.out.println("Результат: ");
        System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" +res4);
    }

}
