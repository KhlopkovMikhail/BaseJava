// Практика с массивами
package com.itproger;

import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] arr = new int[4]; // Создание массива. Выделение памяти под массив [4] (длина) колличества интов в массиве
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 4;  i++) { // Цикл который переберает все эллементы массива от нуля до крайнего эллемента
            System.out.println("Введите число: "); //
            int value = scanner.nextInt(); // Получаем от пользователя значение
            arr[i] = value; // i = введённое значение от пользователя
        }

        int min = arr[0]; // Создание переменной предполагаемого минимального значения (первое в массиве)
        for(int i = 0; i < arr.length; i++) { // Цикл который переберает все эллементы массива от нуля до крайнего эллемента
            if (arr[i] < min) // Если очередное введённое пользователем значение меньше чем первое значение или следующее
                min = arr[i]; // Новое значение становится минимальным
            }
        System.out.println("Minimal: " + min);
        }
    }
