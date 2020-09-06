package ru.job4j.tracker;

import java.util.List;

public class ItemSorter {

    public static void sortId(List<Item> items) {
        items.sort(new SortByIdItem());
    }
    public static void sortName(List<Item> items) {
        items.sort(new SortByNameItem());
    }

}
