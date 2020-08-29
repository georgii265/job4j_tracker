package ru.job4j.lesson11;

public class Main {
    public static void main(String[] args) {

        Cat barsic = new Cat("Барсик", 5, 4);
        String barsicName = barsic.getName();
        int barsicAge = barsic.getAge();
        int barsicWeight = barsic.getWeight();

        System.out.println("Имя кота: " + barsicName);
        System.out.println("Возраст кота: " + barsicAge);
        System.out.println("Вес кота: " + barsicWeight);


        //System.out.println("Изначальное имя кота — " + barsic.getName());
       // barsic.setName("Василий");
        //System.out.println("Новое имя кота — " + barsic.getName());
    }
}
