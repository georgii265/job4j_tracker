package ru.job4j.lesson;

import org.junit.Test;

import java.util.function.Function;

import static org.junit.Assert.assertEquals;

/*
 Ниже приведен код. Вам нужно дописать лямбда выражение, которое извлекает корень квадратный из числа
 */
public class FunctionSqrt {

    public static double calculate(double x) {
        return calculate((a) -> x * x, Math.sqrt(x));
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }


    @Test
    public void test() {
        assertEquals(2, FunctionSqrt.calculate(4), 0.01);
        assertEquals(3, FunctionSqrt.calculate(9), 0.01);
    }
}
