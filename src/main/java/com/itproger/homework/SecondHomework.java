// Second homework
// Персональный перводчик, с пользовательским вводом
package com.itproger.homework;

import java.util.Scanner;

public class SecondHomework {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("i");
        String userTranslation = scan.nextLine();
        String correctTranslation = "я";
        if (correctTranslation.equals(userTranslation)) {
            System.out.println("Верно i переводитя как " + userTranslation);
        }
    }
}
