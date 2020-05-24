package watki;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Application {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Thread myThread = new MyThread();


        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable);


        myThread.start();
        thread.start();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(() -> {
            Thread.sleep(5000);
            return "plik";
        });

        if (!future.isDone()) {
            Thread.sleep(1000);
            System.out.println("Ciagle pracuje..");
        }

        System.out.println(future.get());

        System.out.println("test");


        executorService.shutdown();

    }
}
