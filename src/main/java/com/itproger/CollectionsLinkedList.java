// Тип коллекции LinkedList
package com.itproger;

import java.util.LinkedList;

public class CollectionsLinkedList {

    public static void main(String[] args) {

        LinkedList<Float> numbers = new LinkedList<>();
        numbers.add(5.6f); // Добавление элементов
        numbers.add(15.26f);
        numbers.add(5.64356f);

        for (Float el : numbers)
            System.out.println(el);
    }
}
