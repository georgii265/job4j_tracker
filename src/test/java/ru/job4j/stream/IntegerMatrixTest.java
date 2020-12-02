package ru.job4j.stream;

import org.junit.Test;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class IntegerMatrixTest {
    @Test
    public void main() {
        List<Integer> expected = List.of(1, 2, 3, 4);
        List<Integer> result = IntegerMatrix.main();
        assertThat(result, is(expected));
    }
}
