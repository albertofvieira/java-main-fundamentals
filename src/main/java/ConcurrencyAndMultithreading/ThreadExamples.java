package ConcurrencyAndMultithreading;

public class ThreadExamples {

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();

        Thread t2 = new Thread(new MyRunnable());
        t2.start();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable: running");
            }
        };
        Thread t3  = new Thread(runnable);
        t3.start();

        Runnable run3 = () -> {
            System.out.println("run3: running");
        };

        Thread t4 = new Thread(run3);
        t4.start();

        Runnable r4 = () -> {
            try {
                System.out.println("name: " + Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("r4: finished");
        };

        Thread t5 = new Thread(r4, "r4 name");
        t5.start();
    }

}

class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread1: running");
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("MyRunnable: running");
    }
}
