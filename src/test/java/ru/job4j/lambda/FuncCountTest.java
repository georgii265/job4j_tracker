package ru.job4j.lambda;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class FuncCountTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FuncCount.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        List<Double> result = FuncCount.diapason(5, 8, x -> Math.pow(6,x));
        List<Double> expected = Arrays.asList(7776D, 46656D, 279936D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        List<Double> result = FuncCount.diapason(5, 8, x -> Math.pow(7, x));
        List<Double> expected = Arrays.asList(16807D, 117649D, 823543D);
        assertThat(result, is(expected));
    }
}