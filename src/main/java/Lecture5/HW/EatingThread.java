package Lecture5.HW;

import java.util.concurrent.CountDownLatch;

public class EatingThread extends Thread{
    private Sage sage;
    private Fork rightFork;
    private Fork leftFork;
    private CountDownLatch countDownLatch;

    CountDownLatch generalCountDownLatch;

    public EatingThread(Sage sage, Fork rightFork, Fork leftFork, CountDownLatch generalCountDownLatch) {
        this.sage = sage;
        this.rightFork = rightFork;
        this.leftFork = leftFork;
        this.countDownLatch = new CountDownLatch(3);
        this.generalCountDownLatch = generalCountDownLatch;
    }

    @Override
    public void run() {
        while (countDownLatch.getCount() > 0) {
            if (rightFork.isState() & leftFork.isState()){
                rightFork.setState(false);
                leftFork.setState(false);
                try {
                    sage.sageEats(rightFork, leftFork);
                    Thread.sleep(1000);
                    countDownLatch.countDown();
                    System.out.println(sage.getName() + " has eaten. It was his " + (3 - countDownLatch.getCount()) + " meal" );
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                rightFork.setState(true);
                leftFork.setState(true);

            }
            try {
                sage.sageMeditates();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        generalCountDownLatch.countDown();


    }
}
