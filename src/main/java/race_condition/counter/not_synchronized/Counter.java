package race_condition.counter.not_synchronized;

public interface Counter {

    void increment();

    void decrement();

    int getValue();
}
