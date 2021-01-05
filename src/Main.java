
public class Main {
    
    public static void main(String[] args) {
        BlockingQueue blockingQueue = new BlockingQueue();

        MyAddThread thread1 = new MyAddThread(5,blockingQueue);
        MyAddThread thread2 = new MyAddThread("kodluyoruz",blockingQueue);
        MyPeekThread thread3 = new MyPeekThread(blockingQueue);
       
        thread1.start();
        thread2.start();
        thread3.start();

      
        try {
            thread1.join();
            thread2.join();
            thread3.join();
          
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }
      
        System.out.println("Main thread is finishing");
    }
}
        
        
        
       