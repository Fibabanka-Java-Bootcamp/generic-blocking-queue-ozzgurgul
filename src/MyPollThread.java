
public class MyPollThread<E> extends Thread {

    BlockingQueue myBlockingQueue;

    public MyPollThread(BlockingQueue blockingQueue) {

        this.myBlockingQueue = blockingQueue;
    }

    @Override
    public void run() {

        synchronized (myBlockingQueue) {
            System.out.println("poll thread" + Thread.currentThread().getName() + " Start...");
            System.out.println(myBlockingQueue.poll());
            System.out.println("poll thread" + Thread.currentThread().getName() + " Finish...");
        }
    }

}
