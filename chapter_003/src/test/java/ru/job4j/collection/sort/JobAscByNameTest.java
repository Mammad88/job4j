package ru.job4j.collection.sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JobAscByNameTest {
    @Test
    public void sortAscByNameTest() {
        List<Job> jobs = Arrays.asList(
                new Job("One bug", 1),
                new Job("Two bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        jobs.sort(new JobAscByName());
        List<String> jobNames = new ArrayList<>();
        for (Job job : jobs) {
            jobNames.add(job.getName());
        }
        List<String> expected = Arrays.asList("Fix bug", "One bug", "Two bug", "X task");
        assertThat(jobNames, is(expected));
    }

    @Test
    public void whenComparatorDescByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix Bug,", 1)
        );
        assertThat(rsl, lessThan(4));
    }
}
