package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

/**
 * Напишите тесты, проверяющие отдельно поведение компараторов.
 * Напишите тесты, проверяющие поведение комбинированных компараторов.
 */
public class JobTest {

    @Test
    public void sortByName() {
        Job o1 = new Job("Map", 0);
        Job o2 = new Job("Queue", 1);
        Comparator<Job> comb = new JobByName();
        int result = comb.compare(o1, o2);
        assertThat(result, lessThan(0));
    }

    @Test
    public void sortByPriority() {
        Job o1 = new Job("Queue", 0);
        Job o2 = new Job("Map", 1);
        Comparator<Job> comb = new JobByPriority();
        int result = comb.compare(o1, o2);
        assertThat(result, lessThan(0));
    }

    @Test
    public void sortByNameEqualsPriority() {
        Comparator<Job> jobComparatorName = new JobByNameReverse()
                .thenComparing(new JobByPriorityReverse());
        int result = jobComparatorName.compare(new Job("Queue", 0),
                new Job("Map", 1)
        );
        assertThat(result, lessThan(0));
    }

    @Test
    public void sortByPriorityEqualsName() {
        Comparator<Job> jobComparatorPriority  = new JobByPriority()
                .thenComparing(new JobByPriorityReverse());
        int result = jobComparatorPriority.compare(new Job("Queue", 0), new Job("Map", 1));
        assertThat(result, lessThan(0));
    }
}
