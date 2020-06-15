package ru.job4j.collection.sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JobDescByNameTest {
    @Test
    public void sortDescByNameTest() {
        List<Job> jobs = new ArrayList<>(
                List.of(
                        new Job("One bug", 1),
                        new Job("Two bug", 4),
                        new Job("Fix bug", 2),
                        new Job("X task", 0)
                )
        );
        jobs.sort(new JobDescByName());
        List<String> jobNames = new ArrayList<>();
        for (Job job : jobs) {
            jobNames.add(job.getName());
        }
        List<String> expected = List.of("X task", "Two bug", "One bug", "Fix bug");
        assertThat(jobNames, is(expected));
    }

    @Test
    public void whenComparatorDescByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}
