package ru.job4j.lesson;

import java.util.ArrayList;
import java.util.List;

public class Switcher {

    private List<ElectricityConsumer> listeners = new ArrayList<>();

    public void addElectricityListener(ElectricityConsumer listener) {
        listeners.add(listener);
    }

    public void removeElectricityListener(ElectricityConsumer listener) {
        listeners.remove(listener);
    }

    public void SwitcherOn() {
        System.out.println("Выключатель включен");
//        if (consumer != null) //проверяет нет ли в этом поле ссылки на обьект
//            consumer.electricityOn(); // если есть вызываем метод этого обьекта
        for (ElectricityConsumer c : listeners)
            c.electricityOn(this);
    }
}
