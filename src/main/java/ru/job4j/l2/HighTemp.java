package ru.job4j.l2;

/**
 * Класс для хранения максимальной температуры за день
 */
public class HighTemp {

    private int hTemp;

    HighTemp(int ht) {
        hTemp = ht;
    }

    /**
     * возвратить логическое значение true, если вызывающий объект
     * типа HighTemp имеет такую же температуру, как и у объекта ht2
     */
     boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    /**
     * возвратить логическое значение true, если вызывающий объект
     * типа HighTemp имеет температуру ниже , чем у объекта ht2
     */
     boolean lessThanтemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}
