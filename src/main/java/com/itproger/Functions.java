// Функции (Методы в Java)
package com.itproger;

public class Functions {

    public static void main(String[] args) {
//        info("Hello");
//        String java = "Java";
//        info(java);
//        info("");

        short num = 7;
        summa((short) 5, num);

        short num2 = 8;
        int result2 = summa((short) 4, num2);
        info(String.valueOf(result2));
    }

//    public static void summa(short a, short b) {
//        int res = a + b;
//        String result = "Результат: " + res;
//        info(result);
//        System.out.println("Результат: " + res);

    public static int summa(short a, short b) {
        int res = a + b;
        String result = "Результат: " + res;
        info(result);
        return res;
    }

    public static void info(String word) {
        System.out.print(word);
        System.out.println("!");
    }
}
