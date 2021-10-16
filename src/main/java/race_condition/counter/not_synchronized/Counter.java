package race_condition.counter.not_synchronized;

public class Counter {

    private int number = 0;

    public void increment() {
        number++;
    }

    public void decrement() {
        number--;
    }

    public int getValue() {
        return number;
    }
}
