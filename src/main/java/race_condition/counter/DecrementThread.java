package race_condition.counter;

public class DecrementThread extends Thread {

    private Counter counter;
    private int executionTimes;

    public DecrementThread(Counter counter, int executionTimes) {
        this.counter = counter;
        this.executionTimes = executionTimes;
    }

    @Override
    public void run() {
        for (int i = 0; i < executionTimes; i++) {
            counter.decrement();
        }
    }
}
