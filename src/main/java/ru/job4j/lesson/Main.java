package ru.job4j.lesson;

public class Main {
    public static void main(String[] args) {
        Operations operation = new Operations() {
            @Override
            public int calculate(int x, int y) {
                return x + y;
            }
        };
        int z = operation.calculate(20,10);

        System.out.println(z);

    }
}
@FunctionalInterface
 interface Operations {
    int calculate(int x, int y);
 }