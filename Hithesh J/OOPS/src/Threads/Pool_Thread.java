package Threads;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Pool_Thread implements Runnable {
    /*  public void setMessage(String message) {
          this.message = message;
      }**/
    private String message;

    public Pool_Thread(String s) {
        this.message = s;
    }

    public Pool_Thread(int i) {
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + "(start)message=" + message);
        processmessage();
        System.out.println(Thread.currentThread().getName() + "End");
    }

    private void processmessage() {
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    class TestThreadpool {
        public static void main(String[] args) {
            ExecutorService executor = Executors.newFixedThreadPool(5);
            for (int i = 0; i < 10; i++) {
                Runnable worker = new Pool_Thread(i);
                executor.execute(worker);
            }
            executor.shutdown();
            while (!executor.isTerminated()) {
            }
            System.out.println("Finished all threads");
        }
    }

