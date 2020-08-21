package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NotifyAccountTest {

    @Test
    public void sent() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Ivan Ivanov", "eDer3432f"),
                new Account("142", "Ivan Ivanov", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Ivan Ivanov", "eDer3432f"),
                        new Account("142", "Ivan Ivanov", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void sentDelete() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Ivan Ivanov", "eDer3432f"),
                new Account("123", "Ivan Ivanov", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Ivan Ivanov", "eDer3432f")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}