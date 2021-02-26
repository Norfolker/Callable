import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        final int threadsSum = 4;
        final int messagesSum = 3;

        ExecutorService executor = Executors.newFixedThreadPool(threadsSum);;
        Callable<Integer> callable = new MyCallable(messagesSum);

        for (int i = 0; i < threadsSum; i++) {
            Future<Integer> future = executor.submit(callable);
        }

        executor.shutdown();
    }
}
