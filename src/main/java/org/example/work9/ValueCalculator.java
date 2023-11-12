package org.example.work9;

public class ValueCalculator {
    private static float[] array;
    private static int lengthArray = 1000002;
    private static int halfLengthArray = lengthArray/2;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        array = new float[lengthArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }
        float[] a1 = new float[halfLengthArray];
        float[] a2 = new float[halfLengthArray];
        System.arraycopy(array, 0, a1, 0, halfLengthArray);
        System.arraycopy(array, halfLengthArray, a2, 0, halfLengthArray);
        Thread thread1 = new Thread(() -> change(array, a1));
        Thread thread2 = new Thread(() -> change(array, a2));
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.arraycopy(a1, 0, array, 0, halfLengthArray);
        System.arraycopy(a2, 0, array, halfLengthArray, halfLengthArray);
        System.out.println(System.currentTimeMillis()-start);
    }
    private static void change(float[] array, float[] rez){
        for (int i = 0; i <rez.length ; i++) {
            rez[i]=(float)(array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
