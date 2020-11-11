package ru.job4j.lesson;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class PredicateCheckEvenTest {

    @Test
    public void test() {
        assertTrue(PredicateCheckEven.check(6));
        assertFalse(PredicateCheckEven.check(-2));
        assertFalse(PredicateCheckEven.check(1));
    }
}


