package race_condition.counter;

public class NotSynchronizedCounter implements Counter {

    private int number = 0;

    @Override
    public void increment() {
        number++;
    }

    @Override
    public void decrement() {
        number--;
    }

    @Override
    public int getValue() {
        return number;
    }
}
