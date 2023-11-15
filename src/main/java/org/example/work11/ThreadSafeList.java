package org.example.work11;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class ThreadSafeList {
    private Lock lock = new ReentrantLock();
    private List<Integer> integers = new ArrayList<>();
    public List<Integer> getIntegers() {
        return integers;
    }
    public void add(Integer i) {
        try {
            lock.lock();
            integers.add(i);
        } finally {
            lock.unlock();
        }
    }
    public void remove(Integer i) {
        if(!integers.contains(i)){
            System.out.println("element vidsutniy - remove");
            return;
        }
        try {
            lock.lock();
            integers.remove(i);
        } finally {
            lock.unlock();
        }
    }
    public void get(Integer i) {
        if(!integers.contains(i)){
            System.out.println("element vidsutniy - get");
            return;
        }
        try {
            lock.lock();
            System.out.println(integers.get(i));
        } finally {
            lock.unlock();
        }
    }
}
