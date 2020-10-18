package ru.job4j.lesson;

public class Lamp implements ElectricityConsumer {

    public void linghtOn() {
        System.out.println("Лампа зажглась");
    }

    @Override
    public void electricityOn(Object sender) {
        linghtOn();
    }
}
