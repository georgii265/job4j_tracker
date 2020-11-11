package ru.job4j.stream;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ProfileTest {

    @Test
    public void listAddress() {
        List<Profile> list = new ArrayList<>();
        list.add(new Profile(new Address("Arkhangelsk", "Troitsky", 58, 96)));
        list.add(new Profile(new Address("Pushkino", "Lomonosovo", 456, 87)));
        list.add(new Profile(new Address("Ivanovo", "Gogol", 156, 5)));
        List<Address> addedList = Profiles.collect(list);
        List<Address> addedListAddress = Arrays.asList(new Address("Arkhangelsk", "Troitsky", 58, 96),
                new Address("Pushkino", "Lomonosovo", 456, 87),
                new Address("Ivanovo", "Gogol", 156, 5));
        assertThat(addedList, is(addedListAddress));

    }
}
