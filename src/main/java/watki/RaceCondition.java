package watki;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.*;

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
//        Counter counter = new Counter();
//
//        Runnable runnable = () -> {
//            for (int i = 0; i < 10_000; i++) {
//                counter.increment();
//                System.out.println("Counter: " + counter.getValue() + " Thread: " + Thread.currentThread()); // to juz nie jest synchronizowane :)
//            }
//        };
//        List<String> lista = Arrays.asList("string", "string2");
//        Runnable kolekcje = () -> {
//            lista.remove("string");
//        };
//
////
////        Thread t1 = new Thread(runnable);
////        Thread t2 = new Thread(runnable);
////        Thread t3 = new Thread(runnable);
//        Thread t4 = new Thread(kolekcje);
//        Thread t5 = new Thread(kolekcje);
//        Thread t6 = new Thread(kolekcje);
//
////        t1.start();
////        t2.start();
////        t3.start();
//        t4.start();
//        t5.start();
//        t6.start();
//
//        t4.join();
//        t5.join();
//        t6.join();
//
//        System.out.println(counter.getValue());
//
//        ExecutorService executorService = Executors.newFixedThreadPool(4);
//        executorService.submit(runnable);
////        executorService.submit(runnable);
////        executorService.shutdown();
//
//        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
//        List<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
//
//
//        ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(4);
//        queue.poll();
//
//
//        t4.getState();
//
//
//        Optional<Object> empty = Optional.empty();
//
//        if (empty.isPresent()) {
//            //jakas operacja na empty
//        }
//        empty.orElse(new Object());
//
//        Object object = null;
//        if (object == null) {
//
//        }
//
//        Arrays.asList("string", "string1", "string2")
//                .stream()
//                .filter(p -> p.equals("string"))
//                .findFirst()
//                .orElse("nie znaleziono");
//

    }
}
