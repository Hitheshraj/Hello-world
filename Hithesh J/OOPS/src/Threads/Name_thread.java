package Threads;
/*Inetally the Thread name will be Thread -0 and Thread _1,So we can change the name of the Thread
Current Thread method:
Method returns a reference of current execution thread.**/

public class Name_thread extends Thread{
    public void run(){
        System.out.println("Running...");
    }

    public static void main(String[] args) {
        Name_thread T1 = new Name_thread();
        Name_thread T2 = new Name_thread();
        System.out.println("First Thread name is :"+T1.getName());
        System.out.println("Second Thread name is:"+T2.getName());
        T1.start();
        T2.start();
        T1.setName("First Thread");
        T2.setName("Second Thread ");
        System.out.println("The changed name of the First Thread is:"+T1.getName());
        System.out.println("The changed name of the Second Thread is:"+T2.getName());
    }
}
