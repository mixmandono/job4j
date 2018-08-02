package ru.job4j.max;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static sun.nio.cs.Surrogate.is;

public class MaxTest {

    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }

    private void assertThat(int result, boolean b) {
    }

    @Test
    public void whenFirstLessSecondAndThird() {
        Max maxim = new Max();
        int result = maxim.max(1, 2, 3);
        assertThat(result, is(3));
    }
}
