package ru.job4j.lesson;

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum;
        myNum = () -> 123.45;
        System.out.println("Фиксированное значение : " + myNum.getValue());
        System.out.println();
        myNum = () -> Math.random() * 100;
        System.out.println("Случайное значение: " + myNum.getValue());
        System.out.println();
        System.out.println("Еще одно случайное значение:" + myNum.getValue());
    }
}
