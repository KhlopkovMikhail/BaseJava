// Математические операции
package com.itproger;

import java.util.Scanner;

public class MathematicalOperations {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        short num1 = 50, num2 = 10;
//        int res = num1 + num2;
//        System.out.println("Результат: " + res);

        float num1 = 50, num2 = 33;
        float res = num1 % num2; // % - получение остатка при делении

//        res = res + 10;
        res += 10;
//        res = res + 1;
        res++;
        System.out.println("Результат: " + res);
    }
}
