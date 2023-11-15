package org.example.work11;

public class Application {
    public static void main(String[] args) {
       final ThreadSafeList threadSafeList = new ThreadSafeList();
        Thread t1 = new Thread(()->threadSafeList.add(5));
        Thread t2 = new Thread(()->threadSafeList.add(6));
        Thread t3 = new Thread(()->threadSafeList.add(7));
        Thread t4 = new Thread(()->threadSafeList.remove(6));
        Thread t5 = new Thread(()->threadSafeList.get(1));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(threadSafeList.getIntegers());
    }
}
