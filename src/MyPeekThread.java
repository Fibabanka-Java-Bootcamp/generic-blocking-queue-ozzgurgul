
public class MyPeekThread<E> extends Thread {

    BlockingQueue myBlockingQueue;

    public MyPeekThread(BlockingQueue blockingQueue) {

        this.myBlockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        synchronized (myBlockingQueue) {
            System.out.println("peek thread" + Thread.currentThread().getName() + " Start...");
            System.out.println(myBlockingQueue.peek());
            System.out.println("peek thread" + Thread.currentThread().getName() + " Finish...");
        }
    }

}
