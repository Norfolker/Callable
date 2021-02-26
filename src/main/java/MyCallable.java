import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    private int count;

    public MyCallable(int count) {
        this.count = count;
    }

    @Override
    public Integer call() throws Exception {
        String threadName = Thread.currentThread().getName();
        int num = 0;

        try {
            for (; num < count; num++) {
                Thread.sleep(1500);
                System.out.println(threadName);
            }
        } catch (InterruptedException err) {

        } finally {
            System.out.println(threadName + " завершен" + "\nКоличество сообщений: " + num);
            return num;
        }
    }
}
