package ru.job4j.collection.sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JobDescByPriorityTest {
    @Test
    public void sortDescByPriorityTest() {
        List<Job> jobs = new ArrayList<>(
                List.of(
                new Job("One bug", 1),
                new Job("Two bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
                )
        );
        jobs.sort(new JobDescByPriority());
        List<Integer> priority = new ArrayList<>();
        for (Job job : jobs) {
            priority.add(job.getPriority());
        }
        List<Integer> expected = List.of(4, 2, 1, 0);
        assertThat(priority, is(expected));
    }
}
