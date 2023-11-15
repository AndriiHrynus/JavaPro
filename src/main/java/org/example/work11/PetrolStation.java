package org.example.work11;

import java.util.concurrent.Semaphore;
public class PetrolStation {
    private static volatile double amount=100;
    private static Semaphore semaphore = new Semaphore(3);

    public static void main(String[] args) {
        doRefuel(12);
        doRefuel(13);
        doRefuel(14);
        doRefuel(15);
        doRefuel(16);
    }
    private static void doRefuel(double kil){
        new Thread(()-> {
            try {
                if((amount-kil)<=0){
                    System.out.println(Thread.currentThread().getName() +" no disel " +kil);
                    return;
            }
                System.out.println(Thread.currentThread().getName()+": waiting");
                semaphore.acquire();
                System.out.println("refuel:" + Thread.currentThread().getName());
                 Thread.sleep((int)(Math.random()*7000+3000));
                 amount-=kil;
                System.out.println("end refuel:" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                semaphore.release();
            }
        }).start();
    }
}
