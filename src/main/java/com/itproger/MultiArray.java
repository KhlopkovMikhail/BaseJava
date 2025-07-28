// Многомерные массивы данных
package com.itproger;

public class MultiArray {

    public static void main(String[] args) {

        char[][] syms = new char[2][2]; // Двухмерный массив данных [][]
    //    [[4,6,6],[5,6,7]]; Так выглядит двухмерный массив
        syms[0][0] = 't';
        System.out.println(syms[0][0]);

        byte[][] nums = new byte[][] {
                {5, 7},
                {7, 3},
                {2, 0}
        };

        nums[1][1] = 67;
        System.out.println(nums[1][1]);

    //    for()  Первый цикл переберает среди первого массива а котором 3 набора данных
    //        for() Второй переберает значения в наборе данных (Во вложенном массиве)
    }

}
