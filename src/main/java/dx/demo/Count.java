package dx.demo;

import java.util.concurrent.locks.ReentrantLock;

public class Count {
    private long num;

    ReentrantLock reentrantLock = new ReentrantLock();

    public void count() {
        reentrantLock.lock();
        try {
            for (int i = 1; i <= 1000000; i++) {
                num += i;
            }
            System.out.println(Thread.currentThread().getName() + "-" + num);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() + "的锁释放了");
            reentrantLock.unlock();
        }
    }
}  