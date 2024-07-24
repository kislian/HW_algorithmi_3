package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание 2.15. Основы Алгоритмов часть 3");
        int[] array = SortIntegerMassiv.getMassivRandomValues(100_000);

        long start = System.currentTimeMillis();
        SortIntegerMassiv.sortBubble(Arrays.copyOf(array, array.length));
        System.out.println(System.currentTimeMillis() - start);

        long start2 = System.currentTimeMillis();
        SortIntegerMassiv.sortSelection(Arrays.copyOf(array, array.length));
        System.out.println(System.currentTimeMillis() - start2);

        long start3 = System.currentTimeMillis();
        SortIntegerMassiv.sortInsertion(Arrays.copyOf(array, array.length));
        System.out.println(System.currentTimeMillis() - start3);
    }
}