package ait.deadlock;

public class Task implements Runnable {
    private Object o1;
    private Object o2;

    public Task(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o1) {
            System.out.println(Thread.currentThread().getName() + " Удерживает объект 1");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + " Удерживает объект 2");
            }
        }
    }
}

