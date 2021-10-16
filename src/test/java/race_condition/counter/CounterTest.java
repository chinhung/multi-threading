package race_condition.counter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CounterTest {

    @Test
    public void shouldNotEqualToZero() throws InterruptedException {
        Counter counter = new NotSynchronizedCounter();
        IncrementThread incrementThread = new IncrementThread(counter);
        DecrementThread decrementThread = new DecrementThread(counter);

        incrementThread.start();
        decrementThread.start();

        incrementThread.join();
        decrementThread.join();

        assertNotEquals(0, counter.getValue());
    }

    @Test
    public void shouldEqualToZero() throws InterruptedException {
        Counter counter = new SynchronizedCounter();
        IncrementThread incrementThread = new IncrementThread(counter);
        DecrementThread decrementThread = new DecrementThread(counter);

        incrementThread.start();
        decrementThread.start();

        incrementThread.join();
        decrementThread.join();

        assertEquals(0, counter.getValue());
    }
}
