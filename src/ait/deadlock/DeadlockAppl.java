package ait.deadlock;

public class DeadlockAppl {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Thread thread1 = new Thread(new Task(o1, o2));
        Thread thread2 = new Thread(new Task(o2, o1));
        thread1.start();
        thread2.start();
    }
}



