//Данные от пользователя
package com.itproger;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите ваше имя: ");
//        String username = scan.nextLine();
//        System.out.println("Привет, " + username);
        int num1 = scan.nextInt();
        byte num2 = scan.nextByte();
        boolean b = scan.nextBoolean();
        float num3 = scan.nextFloat();
    }
}
