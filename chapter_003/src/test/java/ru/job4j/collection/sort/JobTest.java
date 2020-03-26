package ru.job4j.collection.sort;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenComparatorDescByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix Bug,", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}
