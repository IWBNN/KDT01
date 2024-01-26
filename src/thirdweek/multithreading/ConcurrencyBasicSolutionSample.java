package thirdweek.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class ConcurrencyBasicSolutionSample {
    private int passCount = 0;
    private final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        ConcurrencyBasicSolutionSample example = new ConcurrencyBasicSolutionSample();
        for (int i = 0; i < 20; i++) {
            Thread thread = new Thread(() -> example.process());
            thread.start();
        }
    }

    // 메서드에 synchronized 키워드를 사용해 스레드 동기화
    private synchronized void process() {
        if (passCount < 10) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("passCount: " + (++passCount));
        } else {
            System.err.println("blocked by passCount condition");
        }
    }
}