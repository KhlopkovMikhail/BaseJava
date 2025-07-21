// Программа с циклами
package com.itproger;

public class CycleProgram {

    public static void main(String[] args) {

        for(int i = 5; i < 25; i += 2 ) {
            if(i % 3 == 0) // Пропускать каждую итерацию кратную числу 3
                continue; // Оператор пропуска итерации

            if(i >= 17)
                break;  // Операто остановки (До)

            System.out.println("Element: " +i);
        }
    }
}
