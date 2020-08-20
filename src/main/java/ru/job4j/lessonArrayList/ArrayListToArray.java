package ru.job4j.lessonArrayList;

import java.util.ArrayList;

public class ArrayListToArray {

    public static void main(String[] args) {
        //создаем списочный массив
        ArrayList<Integer> elmassiv = new ArrayList<>();

        /**
         *  Коллекции могут содержать только ссылки, а не значения примитивных типов.
         *  Но автоматическая упаковка позволяет передавать методу add ( ) значения типа int,
         *  не прибегая к необходимости заключать их в оболочку типа Integer, как это демонстрируется в данной программе.
         *  Таким образом, автоматическая упаковка ощутимо облегчает сохранение в коллекциях значений примитивных типов.
         */
        elmassiv.add(1);
        elmassiv.add(2);
        elmassiv.add(3);
        elmassiv.add(4);

        System.out.println("Coдepжимoe списочного массива elmassiv : " + elmassiv);

        /**
         * метод toArray
         * Object[] toArray() - возвращает массив  обьектов типа Object.
         * <T> T[] toArray(T массив[]) - массив элементов относящихся  к типу Т.
         * (самый удобный метод в котором возвращется надлежащий тип массива)
         */
        //получить обычный массив
        Integer massiv[] = new Integer[elmassiv.size()];
        massiv = elmassiv.toArray(massiv);

        int sum = 0;

        //сумировать все элементы  массива
        for (int i : massiv) sum += i;
        System.out.println("Сумма : " + sum);
    }

}

