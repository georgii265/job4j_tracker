package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindByNameActionTest {
    @Test
    public void whenCheckOutputName() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Tracker tracker = new Tracker();
        Item item = new Item("Enter item name: ");
        tracker.add(item);
        String[] answers = {
                item.getName(), "Enter item name: "
        };
        FindByNameAction act = new FindByNameAction();
        act.execute(new StubInput(answers), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                //.add("Name: " + item.getName() + " id: " + item.getId())
                .add(item.toString())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }
}

