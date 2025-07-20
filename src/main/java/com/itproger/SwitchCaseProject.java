package com.itproger;

import java.util.Scanner;

public class SwitchCaseProject {

    public static void main(String[] args) {
        // Условные конструкции switch-case
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 5:
                System.out.println("Number is 5");
                break;
            case 10:
                System.out.println("Number is 10");
                break;
            default:
                System.out.println("Default");
        }
    }
}
