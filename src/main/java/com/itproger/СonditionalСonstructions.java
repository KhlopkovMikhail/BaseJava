//Условные конструкции if-else
package com.itproger;

public class СonditionalСonstructions {
    public static void main(String[] args) {
        int a = 15;
        int b = 15;
        char sym1 = 'A', sym2 = 'a';
        boolean isHasCar = true;
        if (isHasCar && a == b) {
            System.out.println("Да, верно");
        } else if (a >= b) {
            System.out.println("Second test");
        } else {
            System.out.println("Нет, не верно");
        }

    }

}
