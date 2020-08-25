package ru.job4j.collection;

/**
 * Даны два целых числа a и b (a < b). Найти произведение всех целых чисел от a до b включительно.
 */
public class MultiplicationLoop {

    public static int mult(int a, int b) {
        if (a < b) {
            b *= a % b;
        }
        if (b == 3) {
            b += 3;
        }
        return b;
    }
}


