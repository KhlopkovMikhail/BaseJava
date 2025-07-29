// Коллекции в Java
package com.itproger;

import java.util.ArrayList;

public class Collections {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(1, 30); // Добавления на вторую позицию коллекции элемента 30

        //    System.out.println(numbers.size()); // Вывод длины коллекции (3 элемента)
        System.out.println(numbers.get(1)); // Вывести первый элемент коллекции
//        numbers.remove(1); // Удаление одного из элементов коллекции
//        numbers.clear(); // Очистить весь список коллекции

        for (Integer el : numbers) {
            System.out.println(el);
        }

    }
}
