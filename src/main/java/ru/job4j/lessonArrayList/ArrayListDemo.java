package ru.job4j.lessonArrayList;

import java.util.ArrayList;

/**
 * Параметр <E> обозначает тип сохраняемых обьектов.
 *
 * Класс ArrayList - поддерживаются динамические массивы которые могут наращиваться  по мере надобности.
 * Представляет собой списочный массив обьектных ссылок переменной длины,
 * т.е. размер обьекта может динамически увелчиваться и уменьшаться.
 *
 * ArrayList() - создает пустой списочный массив.
 *
 * ArrayList(Collection < ? extends E > c) - спсочный массив,инициализируемый элементами из заданной коллекции "c".
 *
 * ArrayList(int емкость) - списочный массив имеющий емкость,
 * т.е. размер базового  массива используемого для хранения элементов  данного вида коллекции.
 * Емкость наращивается автоматически по мере ввода  элементов  в списочный массив.
 *
 * метод void ensureCapacity(int емкость) - для наращивания(увеличения) емкости обьектов в ручную.
 *
 * метод void trimToSize() - для уменьшения размера базового массива на основе которого строиться обьект типа ArrayList
 * до текщего количества хранящегося  в действительности обьектов.
 *
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        // создаем списочный массив
        ArrayList<String> elements = new ArrayList<>();

        System.out.println("Начальный  размер списочного массива  elements : " + elements.size());

        // ввести элемнты списочного массива
        elements.add("C");
        elements.add("A");
        elements.add("U");
        elements.add("X");
        elements.add("L");
        elements.add("W");
        elements.add(3, "A2");
        System.out.println("Размер списочного массива elements после ввода элементов : " + elements.size());

        //вывести списочный массив
        System.out.println(elements);

        //удалить элементы из списочного массива
        elements.remove("U");
        elements.remove(5);
        System.out.println("Размер элементов списочного массива после удаления elements: " + elements.size());

        System.out.println(elements);
    }
}
