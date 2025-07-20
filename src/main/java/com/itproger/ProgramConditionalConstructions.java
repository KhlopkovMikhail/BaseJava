package com.itproger;

import java.util.Scanner;

public class ProgramConditionalConstructions {

    public static void main(String[] args) {
        // Условные конструкции if-else
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите роль: ");
        String role = scanner.nextLine();
        System.out.print("Введите пароль ");
        String pass = scanner.nextLine();
        if(role.equals("Admin") && pass.equals("12345")) {
            System.out.println("Все пользователи");
        } else {
            System.out.println("Привет, как вас зовут?");
            String name = scanner.nextLine();
            if (name.equals("Михаил")) {
                System.out.println("Рады знакомству Михаил");
                System.out.println("Напишите вашу фамилию");
                String surname = scanner.nextLine();
                System.out.println("Итак, Михаил " + surname + ", вам необходимо зарегестрироваться");
            }
        }
    }
}
