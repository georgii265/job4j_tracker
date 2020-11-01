package ru.job4j.lesson;


public class ArithmeticActions {

    public static String selectAction(int left, int right, int rsl) {
        if (rsl == 15) {
            return "added";
        } else if (rsl == 5) {
            return "subtracted";
        } else if (rsl == 3) {
            return "divided";
        }
        return "none";
    }
}
