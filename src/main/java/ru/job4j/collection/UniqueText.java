package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    /**
     * Алгоритм решения задания.
     * <p>
     * 1. Преобразовать строку в массив слов. Для этого используется метод String.split(" ").
     * String[] origin = originText.split(" ");
     * String[] text = duplicateText.split(" ");
     * 2. Массив строк вставить через цикл for-each в коллекцию HashSet.
     * for(String text1 : origin)
     * check.add(text1);
     * 3. Преобразовать проверяемый текст в массив слов по аналогии с пунктом 1.
     * for (String text2 : text)
     * 4. Проверить массив строк через цикл for-each в коллекции HashSet используя метод contains.
     * if(!check.contains(text2))
     *
     * @param originText
     * @param duplicateText
     * @return
     */

    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String text1 : origin) {
            check.add(text1);
        }
        for (String text2 : text) {
            if (!check.contains(text2)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}