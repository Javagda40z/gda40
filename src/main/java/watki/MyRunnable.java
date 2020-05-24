package watki;

public class MyRunnable implements Runnable {

    volatile boolean disabled = false;

    @Override
    public void run() {
        while (!disabled) {
            //cos rob;
            //volataile wymusze zczytanie z pamieci
        }
    }
//    @Override
//    public void run() {
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Nowy watek z interfejsu Runnable");
//    }
}
