
public class MyAddThread<E> extends Thread {

    BlockingQueue myBlockingQueue;
    E value;

    public MyAddThread(E value, BlockingQueue blockingQueue) {
        this.value = value;
        this.myBlockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        /* System.out.println(Thread.currentThread().getName()+ "Start...");
        myBlockingQueue.add(this.value);
        System.out.println(this.value + " is added by " +Thread.currentThread().getName() );
        System.out.println(Thread.currentThread().getName()+ "finish"); */

        synchronized (myBlockingQueue) {
            System.out.println(Thread.currentThread().getName() + "  Start");
            myBlockingQueue.add(this.value);
            System.out.println(this.value + " is added by " + Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName() + "  Finish");

        }
    }

}
