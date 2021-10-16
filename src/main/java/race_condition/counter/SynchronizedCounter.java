package race_condition.counter;

public class SynchronizedCounter implements Counter {

    private int number = 0;

    @Override
    public synchronized void increment() {
        number++;
    }

    @Override
    public synchronized void decrement() {
        number--;
    }

    @Override
    public synchronized int getValue() {
        return number;
    }
}
