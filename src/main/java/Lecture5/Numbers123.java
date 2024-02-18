package Lecture5;

public class Numbers123 implements Runnable{
    private final String number;
    private final Object monitor;
    private static int currentThread = 1;
    private final int threadNumber;

    public Numbers123(String number, int threadNumber) {
        this.number = number;
        this.monitor = Numbers123.class;
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
       while (true){
           synchronized (monitor) {
               try {
                   while (threadNumber != currentThread){
                       monitor.wait();
                   }
                   System.out.print(number);
                   Thread.sleep(300);
                   currentThread = threadNumber % 3 +1;
                   monitor.notifyAll();
               }catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
       }
    }
}
