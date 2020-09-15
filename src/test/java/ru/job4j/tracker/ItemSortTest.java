package ru.job4j.tracker;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ItemSortTest {

    @Test
    public void sorId() {
        Item item1 = new Item("Fix bugs", "3");
        Item item2 = new Item("Impl task", "2");
        Item item3 = new Item("Reboot server", "1");
        List<Item> items = Arrays.asList(item3, item2, item1);
        List<Item> tmp = Arrays.asList(item1, item2, item3);
        ItemSorter.sortId(items);
        assertThat(tmp, is(items));
    }

    @Test
    public void sortName() {
        Item item1 = new Item("Fix bugs", "3");
        Item item2 = new Item("Impl task", "2");
        Item item3 = new Item("Reboot server", "1");
        List<Item> items = Arrays.asList(item1, item2, item3);
        List<Item> tmp = Arrays.asList(item3, item2, item1);
        ItemSorter.sortName(items);
        assertThat(tmp, is(items));
    }
}
