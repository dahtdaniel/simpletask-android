package nl.mpcjanssen.simpletask.sort;

import com.google.common.collect.Ordering;

import org.jetbrains.annotations.NotNull;

import nl.mpcjanssen.simpletask.task.Task;

public class FutureComparator extends Ordering<Task> {

    @Override
    public int compare(@NotNull Task a, @NotNull Task b) {
        int futureA = a.inFuture() ? 1 : 0;
        int futureB = b.inFuture() ? 1 : 0;
        return (futureA - futureB);
    }
}
