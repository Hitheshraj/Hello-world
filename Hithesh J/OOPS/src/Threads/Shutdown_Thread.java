package Threads;

import com.sun.jdi.event.ThreadStartEvent;

public class Shutdown_Thread extends Thread {
    public void run() {
        System.out.println("Shut down task completed");
    }

    public static class TestShutdown {
        public static void main(String[] args) {
            Runtime r = Runtime.getRuntime();
            r.addShutdownHook(new Shutdown_Thread());
            System.out.println("now main is slepping ..Press crl+c to exit");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}
